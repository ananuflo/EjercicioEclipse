package Examenfinal;
import java.util.*;
public class Appproducto {

	private static final Object STOCK_SEGURIDAD = null;
	private static int cantidadMaximaProd=100;
	private static Producto [] productos = new Producto[cantidadMaximaProd];
	private static int contadorProductos=0;
	
	
	
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
       Producto inventario = new Producto();
        inventario.mostrarMenu();
    }

    public void mostrarMenu() {
    	var sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMenú de Gestión de Inventario");
            System.out.println("1. Introducir datos nuevo inventario");
            System.out.println("2. Nuevo producto");
            System.out.println("3. Buscar producto y modificar información");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar valor total del inventario");
            System.out.println("6. Informe rotura de stock");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: introducirDatosInventario(); break;
                case 2: nuevoProducto(); break;
                case 3: buscarYModificarProducto(); break;
                case 4: eliminarProducto(); break;
                case 5: mostrarValorTotalInventario(); break;
                case 6: informeRoturaStock(); break;
                case 7: System.out.println("Saliendo del sistema..."); break;
                default: System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 7);
    }

    public void introducirDatosInventario() {
    	var sc = new Scanner(System.in);
        System.out.print("¿Cuántos productos desea ingresar?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            if (contadorProductos >= productos.length) {
                System.out.println("El inventario está lleno.");
                break;
            }
            System.out.println("Ingrese los datos del producto " + (i + 1));
            nuevoProducto();
        }
    }

    public void nuevoProducto() {
    	var sc = new Scanner(System.in);
        if (contadorProductos >= productos.length) {
            System.out.println("El inventario está lleno.");
            return;
        }

        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("Stock del producto: ");
        int stock = sc.nextInt();
        System.out.print("Precio del producto: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        productos[contadorProductos++] = new Producto(nombre, stock, precio);
        System.out.println("Producto agregado correctamente.");
    }

    public void buscarYModificarProducto() {
    	var sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombre = sc.nextLine();

        for (int i = 0; i < contadorProductos; i++) {
            if (productos[i].nombre.equalsIgnoreCase(nombre)) {
                System.out.println("Producto encontrado. Ingrese la nueva información.");
                System.out.print("Nuevo stock: ");
                productos[i].stock = sc.nextInt();
                System.out.print("Nuevo precio: ");
                productos[i].precio = sc.nextDouble();
                sc.nextLine();
                System.out.println("Información del producto actualizada.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void eliminarProducto() {
    	var sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = sc.nextLine();

        for (int i = 0; i < contadorProductos; i++) {
            if (productos[i].nombre.equalsIgnoreCase(nombre)) {
                for (int j = i; j < contadorProductos - 1; j++) {
                    productos[j] = productos[j + 1];
                }
                productos[--contadorProductos] = null;
                System.out.println("Producto eliminado correctamente.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void mostrarValorTotalInventario() {
        double valorTotal = 0;
        for (int i = 0; i < contadorProductos; i++) {
            valorTotal += productos[i].stock * productos[i].precio;
        }
        System.out.printf("El valor total del inventario es: %.2f\n", valorTotal);
    }

    public void informeRoturaStock() {
        System.out.println("\nInforme de rotura de stock:");
        for (int i = 0; i < contadorProductos; i++) {
            if (productos[i].stock < STOCK_SEGURIDAD) {
                System.out.println("Producto: " + productos[i].nombre + " - Stock: " + productos[i].stock);
            }
        }
    }
}
