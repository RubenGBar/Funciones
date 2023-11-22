package ejercicio04;

import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		
		String caracter = "";
		
		boolean mensaje;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un carácter: ");
		caracter = sc.next();
		
		mensaje = Funcion04.vocal(caracter);
		
		if (mensaje) {
			System.out.println("Es vocal");
		}else {
			System.out.println("No es vocal");
		}
		
		sc.close();
		
	}

}
