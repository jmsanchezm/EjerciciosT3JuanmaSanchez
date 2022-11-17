package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Declaramos variable.
		int num; //Se guardará número introducido por el usuario.
		//Creamos el Scanner
		Scanner read = new Scanner (System.in);
		// Solicitamos al usuario un número
		System.out.println("Introduzca un número comprendido entre 0 y 20:");
		//Leemos el dato
		num= read.nextInt();
		//Sólo se tomarán en cuenta los números del intervalo [1,20]
		if (num>=0 && num<=20) {
			/*Mediante un for, declaramos la variable i, y la inicializamos a 1.
			 * Ponemos la condición de que i debe ser menor igual que num
			 * Por casda iteración se irá sumando uno a i.*/
			for (int i = 1; i<= num;i++) {
				/*Creamos otro for, declarando e inicializando j=1.
				 * En este caso, j es la que debe ser menor igual a i.
				 * Por cada iteración se sumará 1 a j*/
				for ( int j=1;j<=i;j++) {
				//Como resultado se le mostrará la variable i como en el ejemplo.
				System.out.print(i);
				}
			//Proporcionamos un salto de línea para que no se muestre todo en una línea.
			System.out.println();
			}
					
		/*En caso de introducir un número diferente al intervalo [1,20], se le mostrará 
		 * un mensaje de ERROR*/
		}else {
		System.out.println("Número introducido no válido");
	}
		//Finalmente, cerramos el Scanner
		read.close();


	}

}
