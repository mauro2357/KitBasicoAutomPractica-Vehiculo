package pe.sura.apivehiculo.datos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.sura.apivehiculo.entidades.Vehiculo;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, String>  {

}
