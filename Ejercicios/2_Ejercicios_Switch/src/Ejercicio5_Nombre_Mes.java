import java.util.Scanner;

public class Ejercicio5_Nombre_Mes {

/*

Escribe un programa que pida al usuario
ingresar un número del 1 al 12
y muestre el nombre del mes correspondiente
utilizando una sentencia switch.

 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el número del mes");
        int mes = scanner.nextInt();

        String result = "";

        switch (mes) {

            case 1:
                result = "enero";
                break;
            case 2:
                result = "febrero";
                break;
            case 3:
                result = "marzo";
                break;
            case 4:
                result = "abril";
                break;
            case 5:
                result = "mayo";
                break;
            case 6:
                result = "junio";
                break;
            case 7:
                result = "julio";
                break;
            case 8:
                result = "agosto";
                break;
            case 9:
                result = "septiembre";
                break;
            case 10:
                result = "octubre";
                break;
            case 11:
                result = "noviembre";
                break;
            case 12:
                result = "diciembre";
                break;

            default:
                System.out.println("El mes indicado no existe");
        }

        if (result !="") {
            System.out.println("El mes " + mes + " es " + result);
        }
    }


}
