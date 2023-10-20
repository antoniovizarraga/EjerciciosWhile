package ejercicioswhile;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/* Creamos e inicializamos el valor que le pediremos al usuario,
		 * y el valor en el que comprobamos si los números son pares o
		 * impares. */
		int user = 0; 
		int num = 0;
		int neg_num = 0;
		int count = 0;
		int zeroes = 0;
		int i = 0;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		/* Le pedimos el valor al usuario para que compruebe si quiere
		 * seguir escribiendo. */
		System.out.println("Introduzca el valor que desee saber si es par o impar." +
		 "\n" + "Si no quiere escribir más valores, introduzca un valor negativo.");
		user = sc.nextInt();
		
		// Si el valor NO es cero...
		while(i < 9) {
			
			
			/* Haz un bucle en el que asignas el valor que ha introducido
			 * el usuario a una variable... */
			
			if(user == 0) {
				zeroes++;
			} else if(user > 0) {
				num += user;
			} else if(user < 0) {
				count++;
				neg_num += user;
			}
			
			
			
			/* Y compruebas si un valor es impar o par
			 * para luego decírselo al usuario... */
			
		
			
			// y le vuelves a pedir el valor (Si es que quiere poner otro).
			System.out.println("\n" + "Escriba el otro valor que quieras añadir. " +
			"Recuerda:" + "\n" + "Si no quieres sumar más valores, escriba el valor 0.");
			user = sc.nextInt();
			
			i++;
			
			// Repite el bucle hasta que el valor sea cero.
		} 
		
		if(count != 0) {
			neg_num = neg_num / count;
		}
		
		/* Si sales del bucle, significa que el valor introducido
		 * es cero. Y por lo tanto, no quiere seguir añadiendo.
		 * valores. Así que cerramos el Scanner. */
		System.out.println("La suma de los números enteros es: " + num +
		"\n" + "La media de los negativos es: " + neg_num + "\n" +
		"\n" + "El número de ceros es: " + zeroes);
		
		sc.close();

	}

}
