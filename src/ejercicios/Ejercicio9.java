package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Declaramos variables.
		int num;//Se guardará el número introducido por el usuario.
		int contador=0;//Inicializamos el contador a 0.
		//Creamos el Scanner
		Scanner read = new Scanner (System.in);
		//Solicitamos al usuario un número
		System.out.print("Introduzca un número para saber de cuantas cifras es:");
		//Leemos el teclado
		num=read.nextInt();
		/*Utilizamos un for donde declaramos la variable i, la cual inicializamos a 1.
		 *Ponemos la condición que i debe ser menor estricto que num.
		 *Por cada iteración se multiplicará por 10 i  */
		for (int i = 1; i<num; i*=10) {
			//Por cada iteración, se sumará uno a contador.
			contador++;
			//Como resultado, se le mostrará al usuario el número de cifras.
		}System.out.println(contador);
		//Finalmente, cerramos el Scanner
		read.close();

	}

}
