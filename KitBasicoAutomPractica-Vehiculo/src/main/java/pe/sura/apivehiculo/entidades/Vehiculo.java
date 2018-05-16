package pe.sura.apivehiculo.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vehiculo")
public class Vehiculo {
	
	@Id
	private String placa;
	private String anio;
	private String modelo;
	private String marca;
	private String zonacirculacion;
	private boolean asegurable;
	
	public Vehiculo() {
		super();
	}
	
	public Vehiculo(String placa, String anio, String modelo, String marca, String zonacirculacion, boolean asegurable) {
		
		super();
		this.placa = placa;
		this.anio = anio;
		this.modelo = modelo;
		this.marca = marca;
		this.zonacirculacion = zonacirculacion;
		this.asegurable = asegurable;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getZonacirculacion() {
		return zonacirculacion;
	}

	public void setZonacirculacion(String zonacirculacion) {
		this.zonacirculacion = zonacirculacion;
	}

	public boolean isAsegurable() {
		return asegurable;
	}

	public void setAsegurable(boolean asegurable) {
		this.asegurable = asegurable;
	}
	
	
 
}
