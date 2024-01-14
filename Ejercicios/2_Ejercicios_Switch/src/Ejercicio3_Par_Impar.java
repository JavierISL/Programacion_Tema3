import java.util.Scanner;

public class Ejercicio3_Par_Impar {

    /*

    Desarrolla un programa que reciba un número entero
    y utilizando una sentencia switch
    determine si es par o impar.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número");
        int numero = scanner.nextInt();

        String result = "";

        switch (numero % 2) {
            case 0:
               result = "Es par";
                break;

            default:
                result = "Es impar";

        }
        System.out.println("El número introducido es "+result);
    }
}
