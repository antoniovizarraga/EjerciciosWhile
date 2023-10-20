package ejercicioswhile;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	/* Vamos a crear el juego de adivina el número. El PC genera
	 * un número de forma aleatoria y el usuario tendrá que
	 * adivinar el número. Si falla, el PC le da la pista de si
	 * el número que ha introducido es mayor o menor que el
	 * número que tiene que adivinar. */
	public static void main(String[] args) {
		/* Creamos el valor de referencia que generará el PC y el valor
		 * que introducirá el usuario. */
		final int RANDOM_NUM;
		int userVal = 0;
		
		// Creamos el Scanner y el valor random.
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		// Generamos un valor del 1 al 100.
		RANDOM_NUM = rd.nextInt(1,100 + 1);
		
		// Le pedimos el valor al usuario.
		System.out.println("El ordenador ha generado un número aleatorio." + "\n" +
		"¿Serás capaz de adivinarlo?" + "\n" +
		"Escribe el número que crees que el ordenador ha generado del 1 al 100.");
		userVal = sc.nextInt();
		
		// Comprueba si el valor introducido no es igual que el valor generado.
		while(userVal != RANDOM_NUM) {
			
			// Genera un bucle en el que...
			
			// Compruebas si el valor introducido es menor o mayor que el del PC.
			if(userVal < RANDOM_NUM) {
				
				// Comprueba si el usuario escribe un valor negativo.
				if(userVal < 0) {
					// De ser así, imprime cuál fue el valor y detén el bucle while.
					System.out.println("Te rendiste... El valor era: " + RANDOM_NUM);
					break;
				}
				// Dile al usuario que el valor es mayor y vuelve a pedirle el valor.
				System.out.println("Fallaste. El valor es mayor.");
				userVal = sc.nextInt();
			} else if (userVal > RANDOM_NUM) {
				// Dile al usuario que el valor es menor y vuelve a pedirle el valor.
				System.out.println("Fallaste. El valor es menor.");
				userVal = sc.nextInt();
			}
		}
		
		/* Comprueba si el valor del usuario es igual que el del valor generado
		 * aleatoriamente. De ser así, felicita al usuario por adivinarlo.*/
		if(userVal == RANDOM_NUM)System.out.println("¡Acertaste! El valor es: " + RANDOM_NUM);
		
		// Cerramos el Scanner.
		sc.close();
	}

}
