package PqUd3;

import java.util.Scanner;


public class Ej3_28B 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        final double PRECIO_BEBIDA = 1.50;
        int opcion, suma;
        double total;
        
        System.out.print("¿Desea una bebida Sí (1) / No (0): ");
        opcion = teclado.nextInt();
        
        suma = 0;
        
        while (opcion ==1)
        {
            suma = suma + 1;
            System.out.print("¿Desea una bebida Sí (1) / No (0): ");
            opcion = teclado.nextInt();
        }
        
        if (opcion==0)
        {
            total  = suma * PRECIO_BEBIDA;
            System.out.printf("\nUsted tomo %d bebidas por un importe total de %.1f euros",suma ,total);
            System.out.println("");
        }


    }

}
