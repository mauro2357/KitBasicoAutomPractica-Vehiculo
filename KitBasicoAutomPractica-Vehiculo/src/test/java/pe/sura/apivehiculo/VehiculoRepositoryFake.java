package pe.sura.apivehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import pe.sura.apivehiculo.datos.VehiculoRepository;
import pe.sura.apivehiculo.entidades.Vehiculo;

@Profile("test")
public class VehiculoRepositoryFake implements VehiculoRepository{
	
	private List<Vehiculo> vehiculos = new ArrayList<>();
	
	public VehiculoRepositoryFake() {
		vehiculos.add(new Vehiculo("ABC-123", "2018", "Chevrolet", "Megane", "Lima", true));
		vehiculos.add(new Vehiculo("ABC-124", "2017", "Toyota", "Yaris", "Callao", true));
		vehiculos.add(new Vehiculo("ABC-125", "1970", "Ford", "Camaro", "Arequipa", true));
		vehiculos.add(new Vehiculo("ABC-126", "2016", "Lamoborgini", "Camaro", "Cuzco", true));
	}

	@Override
	public Vehiculo getOne(String placa) {
		for (int i = 0; i < vehiculos.size(); i++) {
			if(placa.equals(vehiculos.get(i).getPlaca()))
				return  vehiculos.get(i);
		}
		return  new Vehiculo();
	}
	
	@Override
	public List<Vehiculo> findAll() {
		// TODO Auto-generated method stub
		return vehiculos;
	}

	@Override
	public List<Vehiculo> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehiculo> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Vehiculo> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Vehiculo> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Vehiculo> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Vehiculo> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Vehiculo> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Vehiculo> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Vehiculo> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Vehiculo> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Vehiculo entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Vehiculo> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Vehiculo> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Vehiculo> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Vehiculo> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Vehiculo> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}


}
