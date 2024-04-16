package PqUd3;

import java.util.Scanner;


public class Ej3_51 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int numUsu, k, par, total;
        
        System.out.print("Introduce un numero: ");
        numUsu = teclado.nextInt();
        
        par = 2;
        total = 0;
        
        for (k=1; k<=numUsu; k=k+1)
        {
            System.out.print(par + " + ");
            total = total + par;
            par = par + 2;
        }
        System.out.print(" = " + total);
        System.out.println("");


    }

}
