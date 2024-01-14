import java.util.Scanner;

public class Ejercicio4_comprobar_año_bisiesto {

    /* Ejercicio
    4. Hágase un programa que compruebe si un año pedido por teclado es bisiesto.
    En la salida se mostrará o “Es bisiesto” o “No es bisiesto”,)

    El algoritmo para obtener si un año es bisiesto es el siguiente:
    un año es bisiesto si es múltiplo de 4.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica un año");
        int año = scanner.nextInt();

        if (año == año%4) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es Bisiesto");
        }

    }
}
