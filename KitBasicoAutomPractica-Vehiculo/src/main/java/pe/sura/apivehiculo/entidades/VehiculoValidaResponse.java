package pe.sura.apivehiculo.entidades;

public class VehiculoValidaResponse {

	private boolean asegurable;
	private String mensaje;
	
	public VehiculoValidaResponse() {}
	
	public VehiculoValidaResponse(boolean asegurable, String mensaje) {
		super();
		this.asegurable = asegurable;
		this.mensaje = mensaje;
	}
	public boolean isAsegurable() {
		return asegurable;
	}
	public void setAsegurable(boolean asegurable) {
		this.asegurable = asegurable;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
	
}
