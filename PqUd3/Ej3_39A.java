package PqUd3;

import java.util.Scanner;


public class Ej3_39A 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int numUsu;
        
        do
        {
            System.out.print("Introduce un numero del 1 al 10: ");
            numUsu = teclado.nextInt();
            
        }while ((numUsu<0) || (numUsu>10));

    }

}
