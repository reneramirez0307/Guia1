package guia1;

import java.text.DecimalFormat;

public class Ejercicio6 {
	
	
	public static double areaRectangulo(double base, double altura1, double altura2) {
		return base * (altura1 - altura2);
	}
	
	public static double hipotenusa(double altura2, double base) {
		return Math.sqrt(Math.pow(altura2, 2) + Math.pow(base, 2));
	}
	
	public static double areaTriangulo(double altura2, double base) {
		return altura2 * base / 2;
	}
	
	public static double perimetro(double base, double altura1, double altura2, double hipotenusa) {
		return base + altura1 + altura2 + hipotenusa;
	}
	
	public static double areaTerreno(double areaRectangulo, double areaTriangulo) {
		return areaRectangulo + areaTriangulo;
	}
	
	public static void main(String[] args) {
		double base = 7.0;
		double alturaA = 8.0;
		double alturaC = 3.0;
		double areaRectangulo = areaRectangulo(base, alturaA, alturaC);
		double hipotenusa = hipotenusa(alturaC, base);
		double areaTriangulo = areaTriangulo(alturaC, base);
		double perimetro = perimetro(base, alturaA, alturaC, hipotenusa);
		double areaTerreno = areaTerreno(areaRectangulo, areaTriangulo);
		
		DecimalFormat formato = new DecimalFormat("#.##");
		String areaFormateada = formato.format(areaTerreno);
		String perimetroFormateado = formato.format(perimetro);
		
	
		System.out.println("El área del terreno es de " + areaFormateada + " unidades cuadradas.");
		System.out.println("El perímetro del terreno es de " + perimetroFormateado + " unidades.");
		
	}

}
