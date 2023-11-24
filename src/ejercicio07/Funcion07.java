package ejercicio07;

public class Funcion07 {
	public static boolean esPrimo(int n){
		boolean primo = true;
		
		if (n == 1) {
			primo = false;
		}else {
			for (int i = 2; i <= Math.sqrt(n) && primo; i++) {
				if (n % i == 0) {
					primo = false;
				}
			}
		}	
		return primo;
	}

}
