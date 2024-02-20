package guia1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio7 {

	public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
    	return (y2 - y1)/(x2 - x1);
    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese las coordenadas del PRIMER punto:");
	        System.out.print("x1: ");
	        double x1 = scanner.nextInt();
	        System.out.print("y1: ");
	        double y1 = scanner.nextInt();

	        System.out.println("Ingrese las coordenadas del SEGUNDO punto:");
	        System.out.print("x2: ");
	        double x2 = scanner.nextInt();
	        System.out.print("y2: ");
	        double y2 = scanner.nextInt();

	        double distancia = calcularDistancia(x1, y1, x2, y2);
	        double pendiente = calcularPendiente(x1, y1, x2, y2);
	        
	        DecimalFormat formato = new DecimalFormat("#.##");
			String distanciaFormateada = formato.format(distancia);
			String pendienteFormateada = formato.format(pendiente);
			
	        System.out.println("La distancia entre los dos puntos es: " + distanciaFormateada + " unidades.");
	        System.out.println("La pendiente de la recta que une los dos puntos es: " + pendienteFormateada);
	        
	        scanner.close();
	    }

}
