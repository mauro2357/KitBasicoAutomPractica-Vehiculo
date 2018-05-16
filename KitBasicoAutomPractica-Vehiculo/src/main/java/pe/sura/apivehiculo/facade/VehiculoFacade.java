package pe.sura.apivehiculo.facade;


import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.sura.apivehiculo.datos.VehiculoRepository;
import pe.sura.apivehiculo.entidades.Vehiculo;
import pe.sura.apivehiculo.util.IServicioPolicia;
import pe.sura.apivehiculo.util.IServicioTaller;

@Component
public class VehiculoFacade implements IVehiculoFacade {
	
	@Autowired
	VehiculoRepository vehiculoRepository;
	
	@Autowired
	IServicioPolicia servicioPolicia;
	
	@Autowired
	IServicioTaller servicioTaller;

	
	@Override
	public String validar(String placa) {
		
		
		boolean esRobado = servicioPolicia.validaRobado(placa);
		boolean autorizado = servicioTaller.validaAutorizado(placa);
		
		if(esRobado && !autorizado) {
			return "Es robado y no se encuentra autorizado o no existe";
		}else if(esRobado) {
			return "Es robado o no existe";
		}else if(!autorizado) {
			return "No se encuentra autorizado o no existe";
		}else {
			return "Ok";
		}
		
	}

	
	public String zonaCirculacion(String placa) {
		try {
			Vehiculo vehiculo = vehiculoRepository.getOne(placa);

			return vehiculo.getZonacirculacion();
			
		}catch (EntityNotFoundException e){
			return "";
		}
	}
	
	
	
}
