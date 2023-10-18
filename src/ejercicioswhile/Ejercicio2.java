package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio2 {

	/* Vamos a crear un script que pida números positivos al
	 * usuario para poder contarlos. La gracia está en que
	 * puede poner todos los números que quiera hasta que
	 * el usuario introduzca un valor negativo. Ahí será
	 * cuando el programa interpreta que el usuario no
	 * quiere contar más valores y ahí mostraremos la
	 * cuenta de todos los valores introducidos antes
	 * de cerrar el programa. */
	public static void main(String[] args) {
		/* Creamos e inicializamos el valor que le pediremos al usuario
		 * y el valor en el que haremos la cuenta de los números
		 * introducidos. */
		int user, num = 0;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		/* Le pedimos el valor al usuario para saber si quiere que se cuenten
		 * los valores o no. */
		System.out.println("Introduzca el valor que desee contar. Si no quiere contar" +
		"\n" + "más valores, introduzca un valor negativo.");
		user = sc.nextInt();
		
		// Si el valor es positivo...
		while(user >= 0) {
			
			// Haz un bucle en el que sumas 1 a la variable...
			num++;
			
			// y le vuelves a pedir el valor (Si es que quiere seguir contando).
			System.out.println("\n" + "Escriba el otro valor que quiera sumar. Recuerda:"
			+ "\n" + "Si no quieres sumar más valores, escriba un valor negativo.");
			user = sc.nextInt();
			
			// Repite el bucle hasta que el valor sea negativo.
		} 
		
		/* Si sales del bucle, significa que el valor introducido
		 * no es positivo y por lo tanto, no quiere seguir contando.
		 * Así que mostramos el resultado. */
		System.out.println("La cantidad de números introducidos es: " + num + ".");
		
		// Cerramos el Scanner.
		sc.close();

	}

}
