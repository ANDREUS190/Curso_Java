package PqUd3;

import java.util.Scanner;


public class Ej3_28C 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int hijos, edad, familia;
        boolean casado;
        
        System.out.print("¿Cuantos hijos tienes? ");
        hijos = teclado.nextInt();
        
        System.out.print("¿Que edad tiene? ");
        edad = teclado.nextInt();
        
        if ((hijos>=3) && (edad>=18))
        {
            System.out.print("¿Esta usted casado (true/false)? ");
            casado = teclado.nextBoolean();
            
            if (casado==true)
            {
                familia = hijos + 2;
                System.out.printf("Ya son %d en su familia\n", familia);
            }
            else
            {
                System.out.println("¡A ver si te casas ya, Hulio que eres un Hulio!");
            }
            
        }
        
    }

}
