package pe.sura.apivehiculo.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.sura.apivehiculo.entidades.VehiculoValidaResponse;
import pe.sura.apivehiculo.facade.IVehiculoFacade;

@RestController
@RequestMapping("/api")
public class VehiculoController {
	
	@Autowired
	IVehiculoFacade vehiculoFacade;
	  
	
	@GetMapping("/vehiculo/zona/{placa}")
	public String getZonaCirculacion(@PathVariable(value = "placa") String placa) {
		return vehiculoFacade.zonaCirculacion(placa);
	}
	
	@GetMapping(path="/vehiculo/valida/{placa}", produces=MediaType.APPLICATION_JSON_VALUE) 
	public VehiculoValidaResponse getValidacion(@PathVariable(value = "placa") String placa)  {
		    
		VehiculoValidaResponse response = new VehiculoValidaResponse();
		String mensaje = vehiculoFacade.validar(placa);
		response.setAsegurable(mensaje.equalsIgnoreCase("OK"));
		response.setMensaje(mensaje);
	   
		
       return response;
		
		
	}
	 
	

}
