package pe.sura.apivehiculo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import pe.sura.apivehiculo.facade.IVehiculoFacade;
import pe.sura.apivehiculo.facade.VehiculoFacade;


@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= {VehiculoRepositoryFake.class, ServicioPoliciaRepositoryFake.class, ServicioTallerRepositoryFake.class,VehiculoFacade.class})
public class VehiculoFacadeTestConFake {
	
	@Autowired
	IVehiculoFacade vehiculoFacade;
	
	@Test
	public void existeZonaCirculacionEnLima() {
		
		assertEquals("Lima", vehiculoFacade.zonaCirculacion("ABC-123"));
	}
	
	@Test
	public void existeZonaCirculacionNoEnLima() {
		
		assertNotEquals("Lima", vehiculoFacade.zonaCirculacion("ABC-124"));	
	}
	
	@Test
	public void noExisteZonaCirculacionEnLima() {
		
		assertNull(vehiculoFacade.zonaCirculacion("ABC-113"));
	}
	
	@Test
	public void validarNoExiste() {
		assertEquals("No existe el vehiculo", vehiculoFacade.validar("ABC-113"));
	}
	
	@Test
	public void validarExisteEsRobado() {
		assertEquals("Es robado", vehiculoFacade.validar("ABC-123"));
	}
	
	@Test
	public void validarExisteNoAutorizado() {
		assertEquals("No se encuentra autorizado", vehiculoFacade.validar("ABC-124"));
	}
	
	@Test
	public void validarExisteEsRobadoYNoAutorizado() {
		assertEquals("Es robado y no se encuentra autorizado", vehiculoFacade.validar("ABC-125"));
	}
	
	@Test
	public void validarExisteNoEsRobadoYAutorizado() {
		assertEquals("Ok", vehiculoFacade.validar("ABC-126"));
	}
	
}
