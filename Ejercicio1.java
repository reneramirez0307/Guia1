package guia1;

public class Ejercicio1 {
	
	    
	public static int calcularFuncion(int x, int y) {
	    return x * x + 2 * x * y + y * y;
	}
	  
	public static void main(String[] args) {
	    	
	    int x = 8;
	    int y = 24;
	    	
	    int resultado = calcularFuncion(x, y);

	    System.out.println("El valor de la función es "+ resultado + ".");
	       
	}
}