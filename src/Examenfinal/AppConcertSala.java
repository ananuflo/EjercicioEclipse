package Examenfinal;

import java.util.Scanner;

public class AppConcertSala {

	
	private static int contEntradas=1225;
	private static int entradasPrincipal=1000;
	private static int entradasPlatea=200;
	private static int entradasVip=25;
	private static ConcertSala [] entradas = new ConcertSala[3];
	
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int opcion;

		do {
			
			System.out.println("----MENÚ VENTA ENTRADAS----");
			System.out.println("1. Mostrar número de entradas libres");
			System.out.println("2. Vender entradas");
			System.out.println("3. Salir");
			System.out.println("Introduzca una opcion: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1: 
				
				numEntradasLibres();
				
				break;
			case 2:
				
				ventaEntradas();
				
				break;
			case 3:
				
				System.out.println("Saliendo del menú de compra...");
				break;
				
			}
			
		}while(opcion != 3);
	}

	public static void numEntradasLibres() {
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca la zona donde quiere mirar entradas disponibles: ");
		String zona = sc.nextLine();
		
		for(int i =0; i < entradas.length; i++) {
			if(entradas[i].getZona().equalsIgnoreCase(zona)) {
				System.out.println("Las entradas disponibles son: " + entradas[i].getCantidad());
			}
		}
	}
	
	public static void ventaEntradas() {
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca la zona donde quiere comprar la entrada: 1=principal, 2= platea, 3=vip");
		int opcion = sc.nextInt();
		System.out.println("Introduzca la cantidad de entradas a comprar: ");
			int cantidad = sc.nextInt();
			int venta;
			
			do {
				
			switch(opcion) {
			
			case 1:
				venta = entradasPrincipal - cantidad;
				contEntradas--;
			break;
			case 2:
				venta = entradasPlatea - cantidad;
				contEntradas--;
				break;
			case 3:
				venta = entradasVip - cantidad;
				contEntradas--;
			}
			
			System.out.println("Entradas totales disponibles=  " + contEntradas);
			
		}while(opcion == 1 || opcion == 2 || opcion == 3);
		
		
	}
}
