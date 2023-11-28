package ejercicio09;

import java.util.Scanner;

public class Main09 {
	public static void main(String[] args) {
		
		int n, n2, menu;
		
		double resultado;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
		System.out.println("Introduzca un número: ");
		
		n = sc.nextInt();
		
		System.out.println("Introduzca otro número: ");
		
		n2 = sc.nextInt();
		
		System.out.println("Opciones de la Calculadora:");
		System.out.println("1.Sumar "
				+ "\n2.Restar"
				+ "\n3.Multiplicar"
				+ "\n4.Dividir");
		System.out.println("Elija una opción:");
		
		menu = sc.nextInt();
		
		if (n2 == 0 && menu == 4) System.out.println("No se puede dividir entre 0");;
		
		}while (n2 == 0 && menu == 4);
		
		resultado = Funcion09.calculadora(n, n2, menu);
		
		System.out.println("El resultado es: " + resultado);
		
		sc.close();
		
	}

}
