package guia1;

import java.util.Scanner;

public class Ejercicio10 {
	
	
	public static double operaciones(int a, int b, String operador) {
		
		switch (operador) {
		case "+": 
			return a + b;
		case "-": 
			return a - b;
		case "*": 
			return a * b;
		case "/": 
			return a / b;
		case "%": 
			return a % b;
		case "**": 
			return Math.pow(a, b);
		default: 
			return 0;
		
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scannerA = new Scanner(System.in);
		System.out.print("Número entero 1: ");
		String aString = scannerA.nextLine();
		int a = Integer.parseInt(aString);
		
		Scanner scannerB = new Scanner(System.in);
		System.out.print("Número entero 2: ");
		String bString = scannerB.nextLine();
		int b = Integer.parseInt(bString);
		
		Scanner scannerOperador = new Scanner(System.in);
		System.out.print("Operación (+, -, *, /, %, **): ");
		String operador = scannerOperador.nextLine();
		
		
		
		System.out.println("El resultado es: " + operaciones(a, b, operador));
		
		scannerA.close();
		scannerB.close();
		scannerOperador.close();
	}

}
