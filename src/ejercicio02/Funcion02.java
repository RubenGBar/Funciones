package ejercicio02;

public class Funcion02 {
	
	static void mostrarNumeros (int n1, int n2) {
		
		if (n1 < n2) {
			for (int i = n1 + 1; i < n2; i++) {
				System.out.print(i + " ");
			}
		}else {
			for (int i = n1 - 1; i > n2; i--) {
				System.out.print(i + " ");
			}
		}
		
		
	}

}
