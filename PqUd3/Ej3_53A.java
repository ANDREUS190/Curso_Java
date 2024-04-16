package PqUd3;

import java.util.Scanner;


public class Ej3_53A 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int k, m, ladoUsu;

        do
        {
            System.out.print("Introduzca el lado del triangulo: ");
            ladoUsu = teclado.nextInt();
            
        }while ((ladoUsu<1) || (ladoUsu>15));
              
        for (k=1; k<ladoUsu; k=k+1)
        {
            for (m=1; m<=k; m=m+1)
            {
                System.out.print("*");           
            }
            System.out.println("");
        }
    }

}
