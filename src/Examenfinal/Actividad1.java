package Examenfinal;

import java.util.*;

public class Actividad1 {


	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		 // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese una frase
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        
        // Verificar si la frase está vacía o solo contiene espacios
        if (frase.trim().isEmpty()) {
            System.out.println("La frase no contiene palabras.");
            return;
        }
        
        // Dividir la frase en palabras usando espacios en blanco como delimitador
        String[] palabras = frase.trim().split("\\s+");
        
        // Contar la cantidad de palabras
        int cantidadPalabras = palabras.length;
        
        // Inicializar las variables para la palabra de mayor y menor longitud
        String palabraMayor = palabras[0];
        String palabraMenor = palabras[0];
        
        // Recorrer el arreglo de palabras para encontrar la de mayor y menor longitud
        for (String palabra : palabras) {
            if (palabra.length() > palabraMayor.length()) {
                palabraMayor = palabra;
            }
            if (palabra.length() < palabraMenor.length()) {
                palabraMenor = palabra;
            }
        }
        
        // Mostrar los resultados
        System.out.println("Cantidad de palabras: " + cantidadPalabras);
        System.out.println("La palabra de mayor longitud es '" + palabraMayor + "' con " + palabraMayor.length() + " caracteres.");
        System.out.println("La palabra de menor longitud es '" + palabraMenor + "' con " + palabraMenor.length() + " caracteres.");
    }
}



