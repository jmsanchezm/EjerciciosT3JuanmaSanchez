package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Declaro variables
		int hora;//Se guardará la cantidad de horas.
		int min;//Se guardará la cantidad de minutos.
		int seg;//Se guardará la cantidad de segundos.
		int incremento;//Se guardará el incremento.
		//Creamos el Scanner
		Scanner read = new Scanner (System.in);
		//Solicitamos la usuario la cantidad de horas, minutos, segundos.
		System.out.println("Introduzca una cantidad de horas, minutos y segundos: ");
		//Leemos el teclado
		hora= read.nextInt();
		min=read.nextInt();
		seg= read.nextInt();
		//Solictamos un incremento
		System.out.println("Introduzca el incremento: ");
		incremento=read.nextInt();//Leemos el teclado
		
		/*Utilizamos un if para que, en el caso de que los segundos 
		 * y los minutos pasen 60 y la hora 24, se muestre ERROR.*/
		if (seg>=60||min>=60||hora>=24) {
			System.out.println("Datos introducidos erróneos");
		}else {
		/*Creamos un for e inicializamos la variable incremento a 0.
		 * Pnemos la condición de que el incremento sea menor o igual a la variable i.
		 * Y, por cada vuelta que se dé en el bucle, se sumará 1, hasta llegar al valor de incremento.*/
		for ( int i = 0; i<=incremento;i++) {
		//Utilizamos un if para que seg = 59, se restablezca a 0.
			if (seg == 59) {
				seg=0;
		//Utilizamos otro if para que min=59, se restablezca a 0.
				if (min==59) {
					min=0;
		//Utilizamos otro if para que hora = 23, se restablezca a 0.
					if (hora==23) {
						hora=0;
		//En caso contrario, se sumará una hora.
					}else {
						hora++;
					}
		//En caso contrario, se sumará un minuto.
				}else {
					min++;}
		//En caso contrario, se sumará un segundo.
			}else {
				seg++;
			}
		}
		//Como resultado, se mostrará en pantalla el siguiente mensaje.
		System.out.println(hora + " : " + min + " : "+ seg);
	}
		//Finalmente, cerramos el Scanner.
		read.close();


	}

}
