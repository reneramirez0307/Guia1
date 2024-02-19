package guia1;

import java.util.Scanner;

public class Ejercicio9 {
	
	
	public static int hallarMayor (int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
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
		
		int mayor = hallarMayor(a, b);
		
		System.out.println("El número mayor es: " + mayor);
		
		scannerA.close();
		scannerB.close();
	}
	
	
	

}
