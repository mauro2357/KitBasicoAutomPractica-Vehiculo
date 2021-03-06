// This shows a simple build wrapper example, using the AnsiColor plugin.
	
	pipeline { 
		agent any
		triggers { pollSCM('* * * * *') }
		
		stages {
			stage('Probar unitariamente') { 
				steps { 
					bat "test.bat"
				}
			}
		
			
			stage('Analisis de c�digo') { 
				steps { 
					withSonarQubeEnv('SonarQubeLocal') {
						bat 'anali_code.bat'
					}
					
				}
			}
			
			stage('Verificar calidad t�cnica') { 
				steps { 
					script{					
					timeout(time: 1, unit: 'HOURS') { // Just in case something goes wrong, pipeline will be killed after a timeout
						def qg = waitForQualityGate() // Reuse taskId previously collected by withSonarQubeEnv
						if (qg.status != 'OK') {
						  error "Pipeline aborted due to quality gate failure: ${qg.status}"
						}
					}
					}
				}
			}
			
			stage('Generar desplegable') { 
				steps { 
					powershell 'wget http://localhost:8585/shutdown'
					powershell 'wget http://localhost:8586/shutdown'
					bat "build.bat"
					
				}
			}
			
			stage('Desplegar Integraci�n') { 
				steps { 
					bat "deploy-bd.bat"
					bat "deploy-app.bat"
					archiveArtifacts artifacts: 'KitBasicoAutomPractica-Vehiculo/*.txt', excludes: 'output/*.md'
				}
			}

			stage('Versionar'){
				steps {
					script{
						// Obtain an Artifactory server instance, defined in Jenkins --> Manage:
						def server = Artifactory.server 'Jenkins-Local'

						def uploadSpec = """{
						  "files": [
							{
							  "pattern": "*.jar",
							  "target": "kit-basico-repository"
							}
						 ]
						}"""
						def buildInfo2=server.upload(uploadSpec)
						
						server.publishBuildInfo buildInfo2
		
					}
				}
			}
			
			stage('Desplegar Pruebas') { 
				steps { 
				
					script{	
					
					//input "Desea desplegar a pruebas?"
					
						checkout([$class: 'GitSCM', 
						branches: [[name: '*/master']], 
						doGenerateSubmoduleConfigurations: false, 
						extensions: [[$class: 'RelativeTargetDirectory', 
							relativeTargetDir: 'KitBasicoAutomPractica-Vehiculo-Ops']], 
						submoduleCfg: [], 
						userRemoteConfigs: [[url: 'https://github.com/mauro2357/KitBasicoAutomPractica-Vehiculo-Ops.git']]])     
					}
					bat 'mkdir "KitBasicoAutomPractica-Vehiculo/build/libs/config"'
					bat 'xcopy "KitBasicoAutomPractica-Vehiculo-Ops/config" "KitBasicoAutomPractica-Vehiculo/build/libs/config"'
					bat 'copy KitBasicoAutomPractica-Vehiculo-Ops/DefaultFlywayConfig.config /DefaultFlywayConfig.config'
					bat "deploy-bd.bat"
					bat "deploy-app.bat"
					archiveArtifacts artifacts: 'KitBasicoAutomPractica-Vehiculo/*.txt', excludes: 'output/*.md'
				}
			}
			
		}
		
		post {
			failure {
				mail to: 'miguelmedrano24@gmail.com',
					subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
					body: "Something is wrong with ${env.BUILD_URL}"
			}
		}
		
	}