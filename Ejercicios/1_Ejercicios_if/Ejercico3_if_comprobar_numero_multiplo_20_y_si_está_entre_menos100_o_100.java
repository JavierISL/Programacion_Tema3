import java.util.Scanner;


public class Ejercico3_if_comprobar_numero_multiplo_20_y_si_está_entre_menos100_o_100 {

    /* ejercicio
    Léase un número entero. Se comprobará si dicho número es o no múltiplo de 20, y también se comprobará si está o no entre -100 y 100. En la salida se mostrará uno de los siguientes menasajes:
    1. “Es múltiplo de 20 y está entre -100 y 100”.
    2. “Es múltiplo de 20 y no está entre -100 y 100”.
    3. “No es múltiplo de 20 y está entre -100 y 100”-
    4. “No es múltiplo de 20 y no está entre -100 y 100”.
    - * Un número es múltiplo de otro cuando su resto es igual a 0 **
     */
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Indica un numero");
        int num = reader.nextInt();

        if (num%20==0){
            if (num >=-100 && num <= 100){
            System.out.println("El número es multiplo de 20 y esta en rango");

            } else {
                System.out.println("El numero es multiplo de 20 y no esta en rango");
            }
        } else {
            if (num >=-100 && num <= 100){
                System.out.println("El numero no es multiplo y esta en rango");
            } else {
                System.out.println("El numero no es multiplo y no esta en rango");
            }
        }
    }
}
