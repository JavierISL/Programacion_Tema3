import java.util.Scanner;

public class Ejercicio1_Dia_Semana {

     /*
    Escribe un programa en Java que solicite
    al usuario ingresar un número del 1 al 7 y
    muestre el día de la semana correspondiente
    utilizando una sentencia switch.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el día de la semana");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Es el lunes");
                break;
            case 2:
                System.out.println("Es el martes");
                break;
            case 3:
                System.out.println("Es el miercoles");
                break;
            case 4:
                System.out.println("Es el jueves");
                break;
            case 5:
                System.out.println("Es el viernes");
                break;
            case 6:
                System.out.println("Es el sabado");
                break;
            case 7:
                System.out.println("Es el viernes");
                break;


        }

    }
}
