package guia1;

import java.text.DecimalFormat;

public class Ejercicio3 {
	
	
	public static double longitudEscalera(double altura, double anguloGrados) {
		double anguloRadianes = Math.toRadians(anguloGrados);
		double hipotenusa = altura/Math.sin(anguloRadianes);
		return hipotenusa;

	}
	public static void main(String[] args) {
		double altura = 1.0;
		double anguloGrados = 37.0;
		double hipotenusa = longitudEscalera(altura, anguloGrados);
		
		DecimalFormat formato = new DecimalFormat("#.#");
		String hipotenusaFormateada = formato.format(hipotenusa);
		
		System.out.println("La longitud de la escalera es " + hipotenusaFormateada + " unidades.");
	}
}