package ejercicioswhile;
import java.util.Scanner;

public class Ejercicio1 {

	/* Vamos a crear un script que pida números positivos al
	 * usuario para poder sumarlos. La gracia está en que
	 * puede poner todos los números que quiera hasta que
	 * el usuario introduzca un valor negativo. Ahí será
	 * cuando el programa interpreta que el usuario no
	 * quiere sumar más valores y ahí mostraremos la
	 * suma de todos los valores antes de cerrar el
	 * programa. */
	public static void main(String[] args) {
		/* Creamos e inicializamos el valor que le pediremos al usuario
		 * y el valor en el que haremos la suma de los números. */
		int user, num = 0;
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos el valor al usuario para saber si quiere sumar o no.
		System.out.println("Introduzca el valor que desee sumar. Si no quiere sumar" +
		"\n" + "más valores, introduzca un valor negativo.");
		user = sc.nextInt();
		
		// Si el valor es positivo...
		while(user >= 0) {
			
			/* Haz un bucle en el que sumas el valor que ha introducido
			 * el usuario... */
			num += user;
			
			// y le vuelves a pedir el valor (Si es que quiere sumar otro).
			System.out.println("\n" + "Escriba el otro valor que quiera sumar. Recuerda:"
			+ "\n" + "Si no quieres sumar más valores, escriba un valor negativo.");
			user = sc.nextInt();
			
			// Repite el bucle hasta que el valor sea negativo.
		} 
		
		/* Si sales del bucle, significa que el valor introducido
		 * no es positivo y por lo tanto, no quiere seguir sumando.
		 * Así que mostramos la suma final. */
		System.out.println("La suma es: " + num);
		
		// Cerramos el Scanner.
		sc.close();
	}

}
