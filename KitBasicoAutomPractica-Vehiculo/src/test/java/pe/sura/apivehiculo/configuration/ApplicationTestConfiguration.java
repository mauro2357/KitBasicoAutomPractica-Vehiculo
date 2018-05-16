package pe.sura.apivehiculo.configuration;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import pe.sura.apivehiculo.datos.VehiculoRepository;

@Profile("test")
@Configuration
public class ApplicationTestConfiguration {
	
	@Bean
    @Primary
    public VehiculoRepository afiliadosRepository() {
        return Mockito.mock(VehiculoRepository.class);
    }

}
