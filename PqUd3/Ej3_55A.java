package PqUd3;

import java.util.Scanner;


public class Ej3_55A 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int altura, base, k, n;
        
        do
        {
            System.out.print("Introduce la altura: ");
            altura = teclado.nextInt();

            System.out.print("Introduce la base: ");
            base = teclado.nextInt();
        }
        while (base<altura);
        
        for (n=0; n<altura; n=n+1)
        {

            for (k=0; k<base; k=k+1)
            {
                System.out.print("*");
            }

            System.out.println("*");

        }       
  
    }

}
