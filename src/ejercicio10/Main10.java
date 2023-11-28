package ejercicio10;

import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		
		int dia, mes, anio;
		
		boolean esCorrecta;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un día: ");
		dia = sc.nextInt();
		
		System.out.println("Introduzca un mes: ");
		mes = sc.nextInt();
		
		System.out.println("Introduzca un año: ");
		anio = sc.nextInt();
		
		esCorrecta = Funcion10.fechaCorrecta(dia, mes);
		
		if (esCorrecta) {
			System.out.println("La fecha es correcta");
		}else {
			System.out.println("La fecha no es correcta");
		}
		
		sc.close();
		
	}

}
