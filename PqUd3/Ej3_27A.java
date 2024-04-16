package PqUd3;

import java.util.Scanner;


public class Ej3_27A 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int k, numTope, suma;
        
        System.out.print("Introduzca el número que será el último de la serie: ");
        numTope = teclado.nextInt();
        
        k = 0;
        suma = 0;
        
        while (k<numTope)
        {
            k = k + 1;
            suma = suma + k;
            System.out.print(k + " ");
        }
        System.out.println("");
        System.out.println("La suma es " + suma);

    }

}
