package ejercicio02;

public class Funcion02 {
	
	static int mostrarNumeros (int n1, int n2) {
		int numeros = 0;
		
		if (n1 < n2) {
			for (int i = n1; i <= n2; i++) {
				System.out.println(i);
			}
		}else {
			for (int i = n2; i <= n1; i++) {
				System.out.println(i);
			}
		}
		
		return numeros;
	}

}
