import java.util.Scanner;

public class Ejercicio1_if_comprobar_numero {

    /* Ejercicio
    Hágase un programa que lea dos enteros y
    compruebe si el primero es o no mayor que el segundo.
    En la salida se mostrará
    “El primero es mayor que el segundo” o
    “El primero no es mayor que el segundo”.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce un segundo numero");
    int numero2 = scanner.nextInt();

    if (numero1>numero2){
        System.out.println("El primero es mayor que el segundo");
    } else {
        System.out.println("El primero no es mayor que el segundo");
    }

    }
}
