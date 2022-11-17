package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Declaramos variables.
		int num;//Se guardará el número introducido por el usuario.
		//Creamos el Scanner
		Scanner read = new Scanner(System.in);
		//Solicitamos al usuario un número
		System.out.println("Introduzca un número para construir un triángulo: ");
		//Leemos el dato
		num = read.nextInt();
		/*En un for, declaramos e inicializamos k=1.
		 * Ponemos la condición de que k debe ser menor igual a num.
		 * Por cada iteración, se le incrementará uno a k*/
		for (int k = 1; k <= num; k++) {
			/*En otro for, declaramos e inicializamos i=num-1.
			 * Ponemos la condición de que i debe ser mayor a 0,
			 * Por cada iteración, se le restará 1 a i */
			for (int i = num - k; i > 0; i--) {
				//Irá mostrando espacios para alinear la pirámide.
				System.out.print(" ");
			}
			/*Creamos otro for fuera del anterior, donde declaramos
			 *  e inicializamos la variable j a 1.
			 * Ponemos la condición de que j debe ser menor igual a k.
			 * Por cada iteración se le sumará a k, 1*/
					
			for (int j = 1; j <= k; j++) {
				//Este bucle mostrará los asteriscos que conformen la pirámide
				System.out.print("* ");
			}
			//Con esto, podremos dar saltos de línea.
			System.out.println("");
		}
		//Finalmente, cerramos el Scanner
		read.close();


	}

}
