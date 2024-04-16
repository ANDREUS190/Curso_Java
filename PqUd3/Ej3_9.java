package PqUd3;

import java.util.Scanner;


public class Ej3_9 
{

    public static void main(String[] args) 
    {
    Scanner teclado = new Scanner(System.in);
    int num;
    
        System.out.print("Introduce un numero entero: ");
        num = teclado.nextInt();
        
    if ((num%2) !=0)
        {
            System.out.println("El numero "+num+" es impar" );
        
        }
    else
        {
        System.out.println("El numero "+num+" es par" );
        }


    }

}
