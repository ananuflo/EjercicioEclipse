package Examenfinal;

import java.util.Scanner;

public class AppConcertSala {

	
	private static int contEntradas=1225;
	private static int entradasPrincipal=1000;
	private static int entradasPlatea=200;
	private static int entradasVip=25;
	private static ConcertSala [] entradas = new ConcertSala[3];
	
	
	 public static void main(String[] args) {
	        // Crear un objeto de la clase ConcertSala
	        ConcertSala sala = new ConcertSala();
	        sala.mostrarMenu();
	    }

	    // Método para mostrar el menú principal
	    public void mostrarMenu() {
	        Scanner scanner = new Scanner(System.in);
	        int opcion;

	        do {
	            System.out.println("\nMenú de ConcertSala");
	            System.out.println("1. Mostrar número de entradas libres");
	            System.out.println("2. Vender entradas");
	            System.out.println("3. Salir");
	            System.out.print("Elija una opción: ");
	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    mostrarEntradasLibres();
	                    break;
	                case 2:
	                    venderEntradas(scanner);
	                    break;
	                case 3:
	                    System.out.println("Saliendo del sistema...");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Intente de nuevo.");
	                    break;
	            }
	        } while (opcion != 3);

	        scanner.close();
	    }

	    // Método para mostrar la cantidad de entradas disponibles por zona
	    public void mostrarEntradasLibres() {
	        System.out.println("\nEntradas disponibles por zona:");
	        System.out.println("Zona Principal: " + entradasPrincipal + " entradas");
	        System.out.println("Zona Platea: " + entradasPlatea + " entradas");
	        System.out.println("Zona VIP: " + entradasVip + " entradas");
	    }

	    // Método para vender entradas
	    public void venderEntradas(Scanner scanner) {
	        System.out.println("\nElija la zona para la venta de entradas:");
	        System.out.println("1. Zona Principal");
	        System.out.println("2. Zona Platea");
	        System.out.println("3. Zona VIP");
	        System.out.print("Elija la zona (1-3): ");
	        int zona = scanner.nextInt();

	        if (zona < 1 || zona > 3) {
	            System.out.println("Zona no válida. Intente de nuevo.");
	            return;
	        }

	        System.out.print("¿Cuántas entradas desea comprar?: ");
	        int cantidad = scanner.nextInt();

	        switch (zona) {
	            case 1:
	                venderEnZona("Principal", cantidad, entradasPrincipal);
	                break;
	            case 2:
	                venderEnZona("Platea", cantidad, entradasPlatea);
	                break;
	            case 3:
	                venderEnZona("VIP", cantidad, entradasVip);
	                break;
	        }
	    }

	    // Método para realizar la venta de entradas en la zona indicada
	    public void venderEnZona(String nombreZona, int cantidad, int entradasDisponibles) {
	        if (cantidad <= 0) {
	            System.out.println("La cantidad de entradas debe ser mayor a 0.");
	            return;
	        }

	        if (cantidad > entradasDisponibles) {
	            System.out.println("No hay suficientes entradas disponibles en la zona " + nombreZona + ".");
	            System.out.println("Entradas disponibles: " + entradasDisponibles);
	        } else {
	            switch (nombreZona) {
	                case "Principal":
	                    entradasPrincipal -= cantidad;
	                    break;
	                case "Platea":
	                    entradasPlatea -= cantidad;
	                    break;
	                case "VIP":
	                    entradasVip -= cantidad;
	                    break;
	            }
	            System.out.println("Se han vendido " + cantidad + " entradas en la zona " + nombreZona + ".");
	        }
	    }
	}