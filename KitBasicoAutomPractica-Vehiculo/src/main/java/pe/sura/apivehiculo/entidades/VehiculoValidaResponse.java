package pe.sura.apivehiculo.entidades;

public class VehiculoValidaResponse {

	private boolean status;
	private String mensaje;
	
	public VehiculoValidaResponse() {}
	
	public VehiculoValidaResponse(boolean status, String mensaje) {
		super();
		this.status = status;
		this.mensaje = mensaje;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
}
