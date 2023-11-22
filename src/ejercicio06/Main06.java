package ejercicio06;

import java.util.Scanner;

public class Main06 {
	public static void main(String[] args) {
		
		int radio, altura, menu;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un valor para la el radio de la base y la altura de un cilindro respectivamente: ");
		radio = sc.nextInt();
		altura = sc.nextInt();
		
		System.out.println("Elija una opción: "
				+ "\n1. Calcular área"
				+ "\n2. Calcular volúmen");
		
		menu = sc.nextInt();
		
		Funcion06.cilindro(menu, radio, altura);
		
		sc.close();
		
	}

}
