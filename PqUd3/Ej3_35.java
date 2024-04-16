package PqUd3;

import java.util.Scanner;

public class Ej3_35 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int multiplicando, multiplicador;
        
        System.out.print("Introduzca el multiplicador del que desea realizar su tabla: ");
        multiplicador = teclado.nextInt();
        
        multiplicando = 0;
        
        while (multiplicando <=10)
        {
            System.out.println(multiplicador + " * " + multiplicando + " = " 
                    + multiplicador*multiplicando);
            multiplicando = multiplicando + 1;
        }

    }

}
