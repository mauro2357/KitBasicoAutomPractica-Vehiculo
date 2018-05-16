package pe.sura.apivehiculo.util;

import org.springframework.stereotype.Repository;

@Repository
public class ServicioPolicia implements IServicioPolicia{

	public boolean validaRobado(String placa) {
		return ("ABC-124".equals(placa) || "ABC-126".equals(placa)); 
		
	}




}
