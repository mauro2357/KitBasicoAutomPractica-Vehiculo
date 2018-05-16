package pe.sura.apivehiculo.util;

import org.springframework.stereotype.Repository;

@Repository
public class ServicioTaller implements IServicioTaller {

	public boolean validaAutorizado(String placa) {
		return ("ABC-123".equals(placa) || "ABC-126".equals(placa));
	}

}
