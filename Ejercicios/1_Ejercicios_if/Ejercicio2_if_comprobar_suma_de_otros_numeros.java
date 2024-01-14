import java.util.Scanner;

public class Ejercicio2_if_comprobar_suma_de_otros_numeros {

    /* Ejercicio
    Hágase un programa que lea tres enteros positivos,
    y compruebe si alguno es suma de los otros dos.
    En la salida se mostrará “Ninguno es suma de los otros dos” o “8 = 2 + 6”
    (en este último caso se introdujeron los números 2, 8 y 6).
    SumaTres.java
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numero1 = scanner.nextInt();

        System.out.println("Introduce un segundo número");
        int numero2 = scanner.nextInt();

        System.out.println("Introduce un tercer número");
        int numero3 = scanner.nextInt();

        if (((numero1 == numero2 + numero3) || (numero2 == numero1 + numero3)) || (numero3 == numero1 + numero2)) {
        System.out.println("uno de los otros es la suma de los otros");

    } else {
            System.out.println("Ninguno es suma de los otros dos");
        }

    }
}
