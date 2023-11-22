package ejercicio01;

import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		
		n = sc.nextInt();
		
		Funcion01.eco(n);
		
		sc.close();
	}

}
