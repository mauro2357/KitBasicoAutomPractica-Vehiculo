package pe.sura.apivehiculo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import pe.sura.apivehiculo.util.IServicioPolicia;

@Profile("test")
@Repository
public class ServicioPoliciaRepositoryFake implements IServicioPolicia {

	
	public ServicioPoliciaRepositoryFake() {

	}

	public boolean validaRobado(String placa) {
		if("ABC-123".equals(placa)) {
			return true;	
		}else if ("ABC-124".equals(placa)) {
			return false;
		}else if ("ABC-125".equals(placa)) {
			return true;
		}else if ("ABC-126".equals(placa)) {
			return false;
		}else {
			return false;
		}
		
	}
	


}
