package pe.sura.apivehiculo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VehiculoController {

	@GetMapping("/vehiculo/hello")
	public String getSaludo() {
		return "Hola - API Vehiculo";
	}
	
	@GetMapping("/vehiculo/valida/{placa}")
	public String getValidacion() {
		return "Metodo para validar";
	}
	
	@GetMapping("/vehiculo/{placa}")
	public String getZonaCirculacion() {
		return "Metodo para ZonaCirculacion";
	}
 
}
