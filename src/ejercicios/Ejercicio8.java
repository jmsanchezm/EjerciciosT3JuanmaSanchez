package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Declaramos variables
		int num; //Se guardará el número dado por el usuario
		int fallo=0; //Se guardará la cantidad de números fallidos
		int contIntr=1; //Cantidad de numeros introducidos
		int numAnt; //Se guardará el número anterior
		//Creamos el Scanner
		Scanner read = new Scanner(System.in);
		//Solicitamos un número al usuario
		System.out.print("Introduzca un número: ");
		num=read.nextInt();	
		//Mientras que num!=0
		while(num!=0){
			numAnt=num;
			//Solicitamos otro número
			System.out.print("Introduzca otro número: ");
			num=read.nextInt();	
			//Si num cumple la condición, saldrá del bucle
			if(num==0) {
				break;
			}
			//Si numAnt<num
			if (numAnt>num) {
				 //Cambiamos num a uno más bajo
				num=-99999999;
				//Mostramos el mensaje de error
				System.out.println("Fallo, es menor."); 
				//E incrementamos 1 en el contador de fallos
				fallo++; 
			}
			//Incrementamos 1 a los números introducidos
			contIntr++; 
					
		}
		//Como resultado, se le mostrará lo siguiente en pantalla
		System.out.println("Total de numeros introducidos: " + contIntr);
		System.out.println("Total de fallos:" + fallo);
		//Cerramos el escaner
		read.close();


	}

}
