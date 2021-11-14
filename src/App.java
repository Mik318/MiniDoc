import java.util.Scanner;

import sintomas.sintomatologia;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un nombre:");
        String nombre = input.next();
        System.out.println("Ingrese una edad:");
        int edad = input.nextInt();

        sintomatologia sintomas = new sintomatologia(nombre, edad);

        sintomas.data();
    }
}
