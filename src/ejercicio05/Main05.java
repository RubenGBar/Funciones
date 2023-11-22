package ejercicio05;

import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número para ver su tabla de multiplicar: ");
		
		n = sc.nextInt();
		
		Funcion05.tabla(n);
		
		sc.close();
		
	}

}
