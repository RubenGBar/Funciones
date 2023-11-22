package ejercicio04;

public class Funcion04 {
	static boolean vocal(String caracter) {
		boolean esVocal = false;
		
		switch (caracter.toLowerCase().charAt(0)) {
		case 'a', 'e', 'i', 'o', 'u' -> esVocal = true;
		}
		
		return esVocal;
	}

}
