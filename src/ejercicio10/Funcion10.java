package ejercicio10;

public class Funcion10 {
	public static boolean fechaCorrecta(int dia, int mes) {
		boolean correcta = false;
		
		if (dia <= 30 && mes <= 12 && dia >= 1 && mes >= 1) {
			correcta = true;
		}
		
		return correcta;
	}

}
