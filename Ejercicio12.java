package guia1;

import java.util.Scanner;

public class Ejercicio12 {
	
	
	 public static String obtenerDiaSiguiente(String dia) {
		 
	        switch (dia) {
	        case "lunes": 
	        	return "martes";
	        case "martes": 
	        	return "miércoles";
	        case "miércoles": 
	        	return "jueves";
	        case "jueves": 
	        	return "viernes";
	        case "viernes": 
	        	return "sábado";
	        case "sábado": 
	        	return "domingo";
	        case "domingo": 
	        	return "lunes";
	        default: 
	        	return "Día inválido.";
	        }
	    }

	    public static void main(String[] args) {
	    	
	    	Scanner scannerDia = new Scanner(System.in);
			System.out.print("¿Qué día es hoy? (minúsculas) ");
			String dia = scannerDia.nextLine();
			
	        System.out.println("El día siguiente es " + obtenerDiaSiguiente(dia) + ".");
	        
	        scannerDia.close();
	    }

}
