package ejercicio06;

public class Funcion06 {
	static void cilindro(int radio, int altura, int menu) {
		
		switch (menu) {
		case 1 -> System.out.println(2 * Math.PI * radio * (altura + radio));
		case 2 -> System.out.println(Math.PI * Math.pow(radio, 2) * altura);
		}
		
	}

}
