package ejercicio09;

public class Funcion09 {
	public static double calculadora (int n, int n2, int menu){

		double resultado = 0;

		switch (menu) {
		case 1 -> resultado = n + n2;
		case 2 -> resultado = n - n2;
		case 3 -> resultado = n * n2;
		case 4 -> {

			resultado = n / n2;
		}
		}

		return resultado;
	}
}
