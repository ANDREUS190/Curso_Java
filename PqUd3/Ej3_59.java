package PqUd3;

import java.util.Scanner;


public class Ej3_59 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        boolean cero = false;
        
        int num1, num2;
        
        do
        {
            System.out.print("Introduce un numero: ");
            num1 = teclado.nextInt();
            System.out.print("Introduce otro numero: ");
            num2 = teclado.nextInt();
            
            if (num1<num2)
            {
                System.out.println("Lista ordenada: " + num1 + ", " + num2);
            }
            else
            {
                System.out.println("Lista ordenada: " + num2 + ", " + num1);
            }
            
            if ((num1==0) || (num2==0))
            {
                cero = true;
            }
            
            
        }while(cero!=true);


    }

}
