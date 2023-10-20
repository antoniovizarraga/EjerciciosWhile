package ejercicioswhile;
import java.util.Scanner;

public class Ejercicio6 {

	/* Vamos a crear un Script en el cual pondremos todas las edades
	 * de todos los alumnos. Al ponerlas, pondremos la suma total,
	 * la media de las edades, cuántos alumnos hay, y cuántos
	 * alumnos adultos hay en total. Iremos añadiendo valores
	 * hasta que el usuario introduzca un valor menor o igual
	 * que 0. */
	public static void main(String[] args) {
		/* Creamos e inicializamos el valor que pediremos al
		 * usuario junto a la variable: "age" que será la
		 * suma de todas las edades introducidas. También
		 * crearemos: "count" que será el número de alumnos
		 * en total, average será la media de las edades
		 * de los alumnos y adult el número de alumnos
		 * que sean adultos. */
		int user = 0;
		int age = 0;
		int count = 0;
		int average = 0;
		int adult = 0;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		/* Le pedimos el valor al usuario. Le recordamos que si no quiere
		 * introducir ningún otro valor, que introduzca un 0 o un valor
		 * negativo. */
		System.out.println("Introduzca la edad del alumno:" +
		 "\n" + "Si no quiere escribir más valores, introduzca un cero o un valor negativo.");
		user = sc.nextInt();
		
		// Si el valor es MAYOR que cero...
		while(user > 0) {
			
			// Haz un bucle en el que hagas lo siguiente:
			
			/* Comprueba si el valor introducido es mayor que 18.
			 * De ser así, suma 1 a la variable adult... */
			if(user >= 18) {
				adult++;
			}
			
			// Suma el valor introducido por el usuario a age...
			age += user;
			
			// Suma 1 a count (Cada valor introducido es un alumno más)...
			count++;
			
		
			
			// y le vuelves a pedir el valor (Si es que quiere poner otro).
			System.out.println("\n" + "Escriba el otro valor que quieras añadir. " +
			"Recuerda:" + "\n" + "Si no quieres sumar más valores, escriba el valor 0.");
			user = sc.nextInt();
			
			// Repite el bucle hasta que el valor sea menor o igual que cero.
		} 
		
		// Finalmente calculamos la media de la edad.
		average = age / count;
		
		/* Si sales del bucle, significa que el valor introducido
		 * es cero. Y por lo tanto, no quiere seguir añadiendo.
		 * valores. Así que cerramos el Scanner. */
		System.out.println("La suma de todas las edades es: " + age + "\n" +
		"La media de las edades es: " + average + "\n" + "El número de alumnos es: " +
		count + "\n" + "La cantidad de alumnos mayores de edad es: " + adult);
		
		sc.close();

	}

}
