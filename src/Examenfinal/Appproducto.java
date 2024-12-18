package Examenfinal;
import java.util.*;
public class Appproducto {

	private static int cantidadMaximaProd=100;
	private static Producto [] productos = new Producto[cantidadMaximaProd];
	private static int contProductos=0;
	
	
	
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		
		int opcion;
		
		do {
			
			System.out.println("----MENÚ PRODUCTOS----");
			System.out.println("1. Introducir datos nuevo inventario.");
			System.out.println("2. Nuevo producto.");
			System.out.println("3. Buscar producto y modificar información.");
			System.out.println("4. Eliminar producto.");
			System.out.println("5. Mostrar valor total del inventario.");
			System.out.println("6. Informe rotura de stock.");
			System.out.println("7. Salir.");
			System.out.println("Introduzca una opcion: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				
				introducirDatos();
				
				break;
			case 2:
				
				nuevoProducto();
				
				break;
			case 3: 
				
				buscarymodificar();
				
				break;
			case 4:
				
				eliminarProducto();
				
				break;
			case 5:
				
				totalInventario();
				
				break;
			case 6:
				
				roturaStock();
				
				break;
			case 7:
				
				System.out.println("Saliendo del menú...");
				break;
			
			}
			
		}while(opcion != 7);
		
	}
	
	//Apartado d
	public static void nuevoProducto() {
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del artículo: ");
		String nombre = sc.nextLine();
		System.out.println("Introduzca la cantidad disponible: ");
		int cantidad = sc.nextInt();
		System.out.println("Introduzca el precio: ");
		double precio = sc.nextDouble();
		
		productos[contProductos++] = new Producto(nombre, cantidad, precio);
		System.out.println("Nuevo producto registrado con éxito");
		
	}
	
	//Apartado f
	public static void eliminarProducto() {
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre el producto a eliminar: ");
		String nombre = sc.nextLine();
		
		for(int i=0; i < contProductos; i++) {
			
			if(productos[i].getNombre().equalsIgnoreCase(nombre)) {
				
				for (int j = i; j < contProductos - 1; j++) {
					
					productos[contProductos--]= productos [j + i];
					System.out.println("Producto eliminado correctamente");
					
				}
			}
		}
		
	}
	
	//Apartado g
	public static void totalInventario() {
		System.out.println("El total de artículos es: " + contProductos);
	}
	
	//Apartado e
	public static void buscarymodificar() {
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca el artículo a modificar: ");
		String nombre = sc.nextLine();
		
		for (int i =0; i < contProductos; i++) {
			if(productos[i].getNombre().equalsIgnoreCase(nombre)) {
				
				productos[i].setCantidadDispo(65);
				productos[i].setPrecio(54.20);
				
			}
		}
	}
	
	//Apartado c
	public static void introducirDatos() {
		var sc = new Scanner(System.in);
		
		for(int i=0; i < productos.length; i++) {
				System.out.println("Introduzca nombre del artículo: " + (1+i));
				String nombre = sc.nextLine();
				System.out.println("Introduzca cantidad del artículo: " + (1+i));
				int cantidad = sc.nextInt();
				System.out.println("Introduzca precio del producto: " + (1+i));
				
				System.out.println(productos[i]);
			}			
	}
	
	public static void roturaStock() {
		var sc = new Scanner(System.in);
		
		for(int i =0; i < contProductos; i++) {
			if(productos[i].getCantidadDispo() < 50) {
				System.out.println("Rotura de stock del producto.");
			}else {
				break;
			}
		}
	}

}
