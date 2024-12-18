package Examenfinal;

public class Producto {

	
	static String nombre;
	public static Object getNombre;
	private static int cantidadDispo;
	double precio;
	public Object stock;
	
	//Constructor 1 por defecto
	public Producto() {
		this.nombre="";
		this.cantidadDispo=50;
		this.precio=precio;
	}	
	//Constructor 2 con todos los atributos
		public Producto(String nombre, int cantidadDispo, double precio) {
			this.nombre=nombre;
			this.cantidadDispo=50;
			this.precio=precio;
		}
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getCantidadDispo() {
			return cantidadDispo;
		}
		public void setCantidadDispo(int cantidadDispo) {
			this.cantidadDispo = cantidadDispo;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
	
		public String toString() {
			return "Producto [nombre=" + nombre + ", cantidadDispo=" + cantidadDispo + ", precio=" + precio + "]";
		}
	
		public static void totalInventario(int cantidad) {
			cantidad += cantidadDispo;
		}
		public void mostrarMenu() {
			// TODO Auto-generated method stub
			
		}
	
		
}
