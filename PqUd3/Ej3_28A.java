package PqUd3;

import java.util.Scanner;


public class Ej3_28A 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int numIni, numFin, k;
        
        System.out.print("Introduce el número (entero positivo) en el que comenzara la serie: ");
        numIni = teclado.nextInt();
        
        System.out.print("Introduce el número (entero positivo) en el que finalizará la serie: ");
        numFin = teclado.nextInt();
        
        if (numIni<numFin)
        {
            System.out.printf("La serie es: ");
            k = numIni;
            
            while (k<=numFin)
            {   
                System.out.print(k + "-");
                k= k + 1;
                
            }
        }
        
    }

}
