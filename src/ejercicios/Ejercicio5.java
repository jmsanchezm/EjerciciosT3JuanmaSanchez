package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Declaramos las variables
		int a; //Se guardará un valor dado por el usuario.
		int b; //Se guardará ptro valor dado por el usuario.
		int mayor; //Se guardará el valor mayor
		int mcm=0; //Inicializamos mcm a 0
		//Creamos el Scanner
		Scanner read = new Scanner(System.in);
		//Solicitamos dos número
		System.out.println("Introduzca 2 números:");
		//Leemos datos
		a = read.nextInt();
		b = read.nextInt();
		if (a>b) {
			mayor=a;
		} else {
			mayor=b;
		}
		// Utilizamos un for, donde i se inicializa en el valor del número mayor. i no puede ser menor que cero y por cada iteración se incrementará 1.
		for (int i=mayor; i>0; i++) {
			//Si el modulo de i entre a y b es 0, es minimo comun multiplo
			if (i%a == 0 && i%b==0) {
				mcm=i;
				break;
			}
		}
				
		//Como resultado le mostramos al usuario el mcm
		System.out.printf("El minimo comun multiplo de %d y %d es %d",a,b,mcm);
		//Cerramos el Scanner
				read.close();
		 



	}

}
