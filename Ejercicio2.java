package guia1;

public class Ejercicio2 {
	
	
	public static int calcularBuses(int sillas, int gordos, int flacos) {
		int sillasNecesarias = gordos * 2 + flacos;
		int busesNecesarios = (int) Math.ceil((double)
				sillasNecesarias / sillas);
		return busesNecesarios;
	}

	public static void main(String[] args) {
		int sillas = 52;
		int gordos = 43;
		int flacos = 20;
		int busesNecesarios = calcularBuses(sillas, gordos, flacos);

		System.out.println("Se necesitan "+ busesNecesarios + " buses.");
       
	}
}
