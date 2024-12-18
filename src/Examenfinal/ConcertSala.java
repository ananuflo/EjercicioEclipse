package Examenfinal;

public class ConcertSala {

	private String zona;
	private int cantidad;

	
	//Constructor 1 por defecto
	public ConcertSala() {
		this.zona="";
		this.cantidad=cantidad;
	}
	
	//Constructor con atributos
	public ConcertSala(String zona, int cantidad) {
		this.zona=zona;
		this.cantidad=cantidad;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	public String toString() {
		return "ConcertSala [zona=" + zona + ", cantidad=" + cantidad + "]";
	}

	
	
	
	
}
