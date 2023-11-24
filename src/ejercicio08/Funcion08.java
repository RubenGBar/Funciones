package ejercicio08;

import ejercicio07.Funcion07;

public class Funcion08 {
	public static int numDivPrimos (int n) {
		int contador = 0;
		
		for (int i = 2; i <= n; i++) {
			if (n % i == 0 && Funcion07.esPrimo(i)) {
				contador++;
			}
		}
		
		return contador;
	}

}
