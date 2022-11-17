package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Declaramos variables
		int num ; //Se guardará el número introducido por el usuario
		int invert; //Se guardará el número dado la vuelta
		int descomp = 0; //Se guardará la descomposición del número
		int resto;//Se guardará el resto de la división
		//Creamos el Scanner
	    Scanner read = new Scanner(System.in);
	    //Abrimos un do, para que me haga las siguientes instrucciones mientras se cumpla la condición
	    do {
	   //Solicitamos un número al usuario
	    System.out.print("Introduce un número mayor o igual a 0 para decirle si es capicúa o no ");         
	    //Leemos el dato
	    num = read.nextInt(); //Leemos el número
	    } while (num < 0);
	        
	    //Invertimos el número
	    invert = num;
	    //Abrimos un while para mientras que invert sea distinto de cero:
	    while (invert!=0) {
	    //Descomponemos el número
	    resto = invert % 10; 
	    descomp= descomp * 10 + resto; 
	    invert = invert / 10;
	    }
	    
	    // Si num == a descomp, mostrará el siguiente mensaje, en caso contrario otro mensaje distinto.
	    if(num == descomp ){
	    	System.out.println("Es capicua");
	    }else{ 
	    	System.out.println("No es capicua");
	        }
	   //Finalmente, cerramos el Scanner
	   read.close(); 

	}

}
