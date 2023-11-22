package ejercicio03;

import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		int n1, n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca dos números: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		Funcion03.mayor(n1, n2);
		
		sc.close();
	}

}
