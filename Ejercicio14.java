package guia1;

public class Ejercicio14 {
	
	
	public static String hermanoMayor(String nombre1, int edad1, String nombre2, int edad2, String nombre3, int edad3) {
        if (edad1 > edad2 && edad1 > edad3) {
            return nombre1;
        } else if (edad2 > edad1 && edad2 > edad3) {
            return nombre2;
        } else {
            return nombre3;
        }
    }

    public static void main(String[] args) {
        String nombre1 = "Juan";
        int edad1 = 15;
        String nombre2 = "Pedro";
        int edad2 = 18;
        String nombre3 = "María";
        int edad3 = 16;
        System.out.println("El hermano mayor es " + hermanoMayor(nombre1, edad1, nombre2, edad2, nombre3, edad3) + ".");
    }

}
