package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Declaramos variables.
		int a;//Se guardará un valor dado por el usuario
		int b;//Se guardará otro valor dado por el usuario
		int menor; //Se guardará el valor menor de los anteriores.
		int i;//Se guadará el valor de menor.
		//Creamos el Scanner
		Scanner sc = new Scanner (System.in);
		//Solicitamos un valor para a.
		System.out.println("Pon un valor a A: ");
		//Leemos el dato
		a=sc.nextInt();
		//Solicitamos un valor para b
		System.out.println("Pon un valor a B: ");
		//Leemos el dato
		b = sc.nextInt();
		//Mediante un ternario, se decide qué número es menor
		menor=a<b?a:b;
		/*En un favor, declaramos e inicializamos i = menor.
		 * Ponemos la condición de que i debe ser mayor a 0*/
		for (i=menor;i>0;i--) {
			//En caso de cumplir la condición del for, se calcularán los módulos de a y b
			if (a%i==0 && b%i==0) {
				//En el momento en el que sean iguales, se mostrará i y se saldrá del bucle.
				System.out.println(i);
				break;
			}
		}//Finalmente, cerrramos el Scanner
		sc.close();

	}

}
