package ejercicio07;

import java.util.Scanner;

public class Main07 {
	public static void main(String[] args) {
		
		int n;
		
		boolean primoVerdadero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero para comprobar si es primo: ");
		
		n = sc.nextInt();
		
		primoVerdadero = Funcion07.esPrimo(n);
		
		if (primoVerdadero) {
			System.out.println("El n�mero es primo");
		}else {
			System.out.println("El n�mero no es primo");
		}
		
		sc.close();
		
	}

}
