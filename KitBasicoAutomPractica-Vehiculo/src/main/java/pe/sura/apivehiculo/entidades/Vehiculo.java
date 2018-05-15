package pe.sura.apivehiculo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="vehiculo")
public class Vehiculo {
	
	@Id
	private Long placa;
	@Column(name="anyo")
	private String anio;
	private String modelo;
	private String marca;
	private String zonacirculacion;
	
	public Vehiculo(Long placa, String anio, String modelo, String marca, String zonacirculacion) {
		
		super();
		this.placa = placa;
		this.anio = anio;
		this.modelo = modelo;
		this.marca = marca;
		this.zonacirculacion = zonacirculacion;
	}

	public Long getPlaca() {
		return placa;
	}

	public void setPlaca(Long placa) {
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
	
		
	
 
}
