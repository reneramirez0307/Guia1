package guia1;

import java.text.DecimalFormat;

public class Ejercicio5 {
	
	
	public static double areaCirculo(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public static double areaCorona(double radioGrande, double radioChico) {
		return areaCirculo(radioGrande) - areaCirculo(radioChico);
	}
	
	public static void main(String[] args) {
		double radioChico = 1.0;
		double radioGrande = 2.0;
		double areaCorona = areaCorona(radioGrande, radioChico);
		
		DecimalFormat formato = new DecimalFormat("#.##");
		String areaFormateada = formato.format(areaCorona);
		
		System.out.println("El área de la corona es " + areaFormateada + " unidades cuadradas.");
	}

}
