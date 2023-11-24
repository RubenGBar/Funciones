package ejercicio08;

import java.util.Scanner;

public class Main08 {
	public static void main(String[] args) {
		
		int n, numDiv;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número para comprobar el número de divisores primos: ");
		
		n = sc.nextInt();
		
		numDiv = Funcion08.numDivPrimos(n);
		
		System.out.println("El número de divisores primos de " + n + " es de: " + numDiv);
		
		sc.close();
		
	}

}
