package pe.sura.apivehiculo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.sura.apivehiculo.entidades.VehiculoValidaResponse;

@RestController
@RequestMapping("/api")
public class VehiculoController {

	@GetMapping("/vehiculo/hello")
	public String getSaludo() {
		return "Hola - API Vehiculo";
	}
	  
	@GetMapping("/vehiculo/valida/{placa}") 
	public VehiculoValidaResponse getValidacion(@PathVariable(value = "placa") String placa) {
		return new VehiculoValidaResponse(true, "");
	}
	
	@GetMapping("/vehiculo/{placa}")
	public VehiculoValidaResponse getZonaCirculacion(@PathVariable(value = "placa") String placa) {
		return new VehiculoValidaResponse(true, "Circula por Lima");
	}
   
}
