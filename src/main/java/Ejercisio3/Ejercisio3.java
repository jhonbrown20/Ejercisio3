package Ejercisio3;

import java.util.Scanner;

public class Ejercisio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char Operacion;
        int n1;
        int n2;
        int suma;
        int resta;
        int multiplicacion;
        int division;

        System.out.println(" digite que pedido quiere realizar");
        Operacion = entrada.nextLine().charAt(0);

        switch (Operacion) {
            case 's':
            case 'S':
                System.out.println(" por favor digitar el numero1");
                n1 = entrada.nextInt();
                System.out.println(" digite el segundo numero");
                n2 = entrada.nextInt();
                suma = n1 + n2;
                System.out.println(" la suma es " + suma);
                break;
            case 'r':
            case 'R':
                System.out.println(" por favor digitar el numero1");
                n1 = entrada.nextInt();
                System.out.println(" digite el segundo numero");
                n2 = entrada.nextInt();
                resta = n1 - n2;
                System.out.println(" la resta es " + resta);
                break;
            case 'm':
            case 'M':
                System.out.println(" por favor digitar el numero1");
                n1 = entrada.nextInt();
                System.out.println(" digite el segundo numero");
                n2 = entrada.nextInt();
                multiplicacion = n1 + n2;
                System.out.println(" la suma es " + multiplicacion);
                break;
            case 'd':
            case 'D':
                System.out.println(" por favor digitar el numero1");
                n1 = entrada.nextInt();
                System.out.println(" digite el segundo numero");
                n2 = entrada.nextInt();
                division = n1 - n2;
                System.out.println(" la resta es " + division);
                break;
            default:
                System.out.println(" error en el pedido");

        }

    }

}
