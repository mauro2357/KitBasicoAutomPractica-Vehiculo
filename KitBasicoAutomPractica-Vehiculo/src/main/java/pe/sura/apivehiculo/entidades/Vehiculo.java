package pe.sura.apivehiculo.entidades;

public class Vehiculo {
	
	private String placa;
	private String anio;
	private String modelo;
	private String marca;
	
	private String zonaCirculacion;
	private boolean asegurable;
	
	public Vehiculo(String placa, String anio, String modelo, String marca, String zonaCirculacion, boolean asegurable) {
		
		super();
		this.placa = placa;
		this.anio = anio;
		this.modelo = modelo;
		this.marca = marca;
		this.zonaCirculacion = zonaCirculacion;
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

	public String getZonaCirculacion() {
		return zonaCirculacion;
	}

	public void setZonaCirculacion(String zonaCirculacion) {
		this.zonaCirculacion = zonaCirculacion;
	}

	public boolean isAsegurable() {
		return asegurable;
	}

	public void setAsegurable(boolean asegurable) {
		this.asegurable = asegurable;
	}
	
		
	
 
}
