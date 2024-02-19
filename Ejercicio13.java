package guia1;

import java.util.Scanner;

public class Ejercicio13 {
	
	
	public static double aumento(double salario) {
        if (salario <= 800000) {
            return salario * 0.1;
        } else if (salario <= 1200000) {
            return salario * 0.08;
        } else {
            return salario * 0.05;
        }
    }

    public static void main(String[] args) {
    	
    	Scanner scannerSalario = new Scanner(System.in);
		System.out.print("Ingrese el salario actual: ");
		String salarioString = scannerSalario.nextLine();
		int salario = Integer.parseInt(salarioString);
    	
        double aumento = aumento(salario);
        System.out.println("El aumento es de: $" + aumento);
        System.out.println("El nuevo salario es de: $" + (salario + aumento));
        
        scannerSalario.close();
    }

}
