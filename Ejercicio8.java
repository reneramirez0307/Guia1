package guia1;

import java.util.Scanner;

public class Ejercicio8 {
	
	
	public static int calcularNSalones(int capacidad, int nEstudiantes) {
		return (int) Math.ceil((double) nEstudiantes / capacidad);
	}
	
	public static int calcularNPisos(int nSalones, int salonesXPiso) {
		return (int) Math.ceil((double) nSalones / salonesXPiso);
	}
	
	public static void main(String[] args) {
		
		Scanner scannerEstudiantes = new Scanner(System.in);
		System.out.print("Cantidad de estudiantes: ");
		String nEstudiantesString = scannerEstudiantes.nextLine();
		int nEstudiantes = Integer.parseInt(nEstudiantesString);
		
		Scanner scannerCapacidad = new Scanner(System.in);
		System.out.print("Capacidad de estudiantes por salón: ");
		String capacidadString = scannerCapacidad.nextLine();
		int capacidad = Integer.parseInt(capacidadString);
		
		Scanner scannerSalones = new Scanner(System.in);
		System.out.print("Número de salones por piso: ");
		String salonesString = scannerSalones.nextLine();
		int salonesXPiso = Integer.parseInt(salonesString);
		
		int nSalones = calcularNSalones(capacidad, nEstudiantes);
		int nPisos = calcularNPisos(nSalones, salonesXPiso);
		
		System.out.println("El total de salones es de " + nSalones);
		System.out.println("El total de pisos es de " + nPisos);
		
		scannerEstudiantes.close();
		scannerCapacidad.close();
		scannerSalones.close();
	}
	

}
