import java.util.Scanner;

public class Ejercicio2_Vocal_Consonante {

    /*
    Crea un programa que permita al usuario ingresar un carácter
    y luego determine si es una vocal o
    una consonante utilizando una sentencia switch.


     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una letra");
        char letra = scanner.next().charAt(0);

        switch (String.valueOf(letra).toUpperCase().charAt(0)) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Es voal");
                break;

            default:
                System.out.println("Es consonante");

        }

    }
}
