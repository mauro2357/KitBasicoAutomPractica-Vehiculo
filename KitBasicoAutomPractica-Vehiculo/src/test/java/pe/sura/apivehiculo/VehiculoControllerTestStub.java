package pe.sura.apivehiculo;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pe.sura.apivehiculo.controller.VehiculoController;
import pe.sura.apivehiculo.entidades.VehiculoValidaResponse;
import pe.sura.apivehiculo.facade.IVehiculoFacade;
import pe.sura.apivehiculo.facade.VehiculoFacade;

import static org.mockito.Mockito.when;


@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= {VehiculoRepositoryFake.class, ServicioPoliciaRepositoryFake.class, ServicioTallerRepositoryFake.class,VehiculoFacade.class})
public class VehiculoControllerTestStub {
	
	@Autowired
	IVehiculoFacade vehiculoFacade;
	
	@Mock
    VehiculoController controller;
	
	@Test
	public void ejecutaGetValidacionVehiculo() {
		when(controller.getValidacion("")).thenReturn(new VehiculoValidaResponse());
		assertNotNull(controller.getValidacion(""));
	}
	
	@Test
	public void ejecutaGetZonaVehiculo() {
		when(controller.getZonaCirculacion("")).thenReturn("");
		assertNotNull(controller.getZonaCirculacion(""));
	}
	
}
