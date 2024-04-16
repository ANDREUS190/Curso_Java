package PqUd3;

import java.util.Scanner;


public class Ej3_13 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        double saldo, reintegro;
        int respuesta;

        System.out.print("Introduce el saldo de la cuenta bancaria: ");
        saldo = teclado.nextDouble();

        System.out.print("Introduce el reintegro que desea realizar: ");
        reintegro = teclado.nextDouble();

        if(reintegro<=saldo)
        {
            System.out.print( "Esta usted seguro (Sí(1),SI(2) o si(3)) / No(4): " );
            respuesta = teclado.nextInt();


            if ((respuesta==1) || (respuesta==2) || (respuesta==3))
            {
                saldo = (saldo-reintegro);
                System.out.printf("Saldo restante: %.1f\n",saldo);
            }
            else
            {
                System.out.printf("Saldo actual: %.1f\n",saldo);
            }
        }


    }

}
