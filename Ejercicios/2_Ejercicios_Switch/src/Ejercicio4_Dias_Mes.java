import java.util.Scanner;

public class Ejercicio4_Dias_Mes {

/*

Realiza un programa que solicite al usuario ingresar
un mes (como un número del 1 al 12)
y muestre la cantidad de días que tiene ese mes
considerando años no bisiestos.

 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el número del mes");
        int mes = scanner.nextInt();

        int result = 0;

        switch (mes) {

            case 1:
                result = 31;
                break;
            case 2:
                result = 28;
                break;
            case 3:
                result = 31;
                break;
            case 4:
                result = 30;
                break;
            case 5:
                result = 31;
                break;
            case 6:
                result = 30;
                break;
            case 7:
                result = 31;
                break;
            case 8:
                result = 31;
                break;
            case 9:
                result = 30;
                break;
            case 10:
                result = 31;
                break;
            case 11:
                result = 30;
                break;
            case 12:
                result = 31;
                break;

            default:
                System.out.println("El número mes indicado no existe");
        }

        if (result !=0) {
            System.out.println("El mes " + mes + " tiene " + result + " días ");
        }
    }
}
