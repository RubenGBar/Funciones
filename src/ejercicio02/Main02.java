package ejercicio02;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		
		int n1, n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		
		n1 = sc.nextInt();
		
		System.out.println("Introduzca otro número: ");
		
		n2 = sc.nextInt();
		
		Funcion02.mostrarNumeros(n1, n2);
		
		sc.close();
		
	}

}
