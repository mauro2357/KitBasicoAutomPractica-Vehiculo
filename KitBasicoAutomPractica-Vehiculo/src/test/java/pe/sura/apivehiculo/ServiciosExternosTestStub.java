package pe.sura.apivehiculo;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.sura.apivehiculo.util.IServicioPolicia;
import pe.sura.apivehiculo.util.IServicioTaller;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class ServiciosExternosTestStub {

	@Mock
	IServicioTaller servicioTaller;
	
	@Mock
	IServicioPolicia servicioPolicia;
	
	@Test
	public void validaServicioAutorizadoTaller() {
		when(servicioTaller.validaAutorizado("")).thenReturn(false);
		assertFalse(servicioTaller.validaAutorizado(""));
	}
	
	@Test
	public void valiaServicioPolicia() {
		when(servicioPolicia.validaRobado("")).thenReturn(false);
		assertFalse(servicioPolicia.validaRobado(""));
	}
}
