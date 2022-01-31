package paquete;

import java.util.Date;

public class Mensaje {

	private String emisor;
	private String texto;
	private Date fecha_hora_creacion;
	private Date fecha_hora_modificacion;
	private String destinatario;
	
	public Mensaje() {
		this.emisor = "Emisor desconocido";
		this.texto = "Texto desconocido";
		this.destinatario = "Nombre destinatario";
		this.fecha_hora_creacion = new Date();
		this.fecha_hora_modificacion = new Date();
		
	}
	
	public Mensaje(String emisor, String texto) {
		super();
		this.emisor = emisor;
		this.texto = texto;
		this.destinatario = "Nombre destinatario";
		this.fecha_hora_creacion = new Date();
		this.fecha_hora_modificacion = new Date();
	}

	public String getEmisor() {
		return emisor;
	}
	public String getDestinatario() {
		return destinatario;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
		actualizarFechaModificacion();
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
		actualizarFechaModificacion();
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
		actualizarFechaModificacion();
	}

	private void actualizarFechaModificacion() {
		this.fecha_hora_modificacion = new Date();
		System.out.println("¡Hora actualizada!");
	}
	@Override
	public String toString() {
		return "(" + fecha_hora_creacion + ")" + " Mensaje de " + emisor + ": " + texto;
	}
	
	
	
	
	

}
