package pe.sura.apivehiculo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.sura.apivehiculo.facade.IVehiculoFacade;

@RestController
@RequestMapping("/api")
public class VehiculoController {
	
	@Autowired
	IVehiculoFacade vehiculoFacade;

	@GetMapping("/vehiculo/hello")
	public String getSaludo() {
		return "Hola - API Vehiculo";
	}
	  
	
	@GetMapping("/vehiculo/{placa}")
	public String getZonaCirculacion(@PathVariable(value = "placa") String placa) {
		return vehiculoFacade.zonaCirculacion(placa);
	}
	
	 
	@GetMapping("/vehiculo/valida/{placa}") 
	public String getValidacion(@PathVariable(value = "placa") String placa) {
		return vehiculoFacade.validar(placa);
	}

}
