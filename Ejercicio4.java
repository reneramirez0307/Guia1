package guia1;

public class Ejercicio4 {
	
	
	public static double gastoArriendo(double sueldo) {
		return sueldo * 0.40;
	}
	
	public static double gastoComida(double sueldo) {
		return sueldo * 0.15;
	}
	
	public static void main(String[] args) {
		double sueldoPedro = 1250000.0;
		double arriendo = gastoArriendo(sueldoPedro);
		double comida = gastoComida(sueldoPedro);
		double dineroRestante = sueldoPedro - arriendo - comida;
		
		System.out.println("Sueldo de Pedro: $" + sueldoPedro);
		System.out.println("Gasto en arriendo: $" + arriendo);
		System.out.println("Gasto en comida: $" + comida);
		System.out.println("Dinero restante: $" + dineroRestante);
	}

}
