package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Declaramo variable
		int num; //Se guardará el número dado por el usuario
		int altura=1;//Se guardará la altura del triángulo
		//Creamos el Scanner
		Scanner read = new Scanner (System.in);
		//Solicitamos al usuario un número
		System.out.println("Introduzca un número ");
		//Leemos el dato
		num= read.nextInt();
		//Mientras que la altura sea menor igual que num:
		 while (altura <= num) {
			 //Inicializamos i=1 y esta debe ser menor a altura. Por cada iteración se le sumará 1
	         for (int i = 1; i < altura; i++) {
	           System.out.print(i); 
	         }
	         //Inicializamos otra i = altura, que debe ser mayor a cero. Por cada iteración se restará 1.
	         for (int i = altura; i > 0; i--) { 
	           System.out.print(i);
	         }
	         //Esto indicará saltos de línea
	         System.out.println(); 
	         
	         altura++; 
		}//Finalmente, cerramos el Scanner
		read.close();
	}

}
