package Examenfinal;

import java.util.*;

public class Actividad1 {

	
	
	public static int contarPalabras() {
		var sc = new Scanner(System.in);
		int contador = 1;
		
		System.out.println("Introduzca una frase: ");
		String frase = sc.nextLine();
		
	for (int i = 0; i < frase.length(); i++) {
		if (Character.isWhitespace(frase.charAt(i))) {
				contador++;
	}
		
}
	return contador;
					
}
	
	public static int mayorLongitud(String frase1) {
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca una frase: ");
		String frase = sc.nextLine();
		int contadorPalabras=1;
		int palabraMayor=0;
		
		for(int i=0; i < frase.length(); i++) {
			if (Character.isWhitespace(frase.charAt(i))) {
				contadorPalabras++;
				contadorPalabras = palabraMayor;
	}
			
		}
		
		return palabraMayor;
		
		
	}
	
	public static int menorLongitud(String frase1) {
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca una frase: ");
		String frase = sc.nextLine();
		int contadorPalabras=1;
		int palabraMenor=0;
		
		for(int i=0; i < frase.length(); i++) {
			if (Character.isWhitespace(frase.charAt(i))) {
				contadorPalabras++;
				
				contadorPalabras = palabraMenor;
	
			
		}
		
		
	}
		return palabraMenor;
}
	
	
	
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		
		//Apartado a
		System.out.println("Introduzca una frase: ");
		String frase = sc.nextLine();
		
		System.out.println("La frase contiene " + contarPalabras() + " palabras.");
		
		//Apartado b
		
		System.out.println("La palabra más larga de la frase es: " + mayorLongitud(frase));
		System.out.println("La palabra más corta de la frase es: " + menorLongitud(frase));

		
	}
	
	
}


