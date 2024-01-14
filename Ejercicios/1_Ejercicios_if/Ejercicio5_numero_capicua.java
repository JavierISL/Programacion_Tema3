import java.util.Scanner;

public class Ejercicio5_numero_capicua {

    /* Ejercicio
    5. Determinar si un número natural de 4 dígitos
    (entre 1000 y 9999) es capicúa.
    Se comprobará previamente que el número introducido tiene 4 dígitos.
    En la salida se mostrará uno de los siguientes mensajes:
    1. “El número no tiene 4 dígitos”;
    2. “Es capicúa”
    3. “No es capicúa”.
    - * Un número es capicúa cuando se lee
    igual de izquierda a derecha que de derecha a izquierda **
     */
    public static void main(String[] args) {



        int num = 1221;
        int millares1 = num/1000;
        int resto = num%1000;
        int centenas1= resto/100;
        System.out.println(millares1);
        System.out.println(centenas1);
        resto = resto%100;

        int decenas1 = resto/10;
        System.out.println(decenas1);

        int unidades1 = resto%10;
        System.out.println(unidades1);

        System.out.println();
        String numeroPalabra = String.valueOf(num);


        if (num >=1000 && num <= 9999) {

            int millares = num / 1000;
            int centenas = (num % 1000) / 100;

            if (numeroPalabra.charAt(0) == numeroPalabra.charAt(3) && numeroPalabra.charAt(1) == numeroPalabra.charAt(2)) {
                System.out.println("El número es capicua");

            } else {
                System.out.println("El número no es capicua");
            }
        }else {
                System.out.println("Numero fuera del rango");
            }


        }


    }

