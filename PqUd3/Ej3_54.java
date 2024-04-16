package PqUd3;

import java.util.Scanner;


public class Ej3_54 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int numIntro, k, num, suma;
            
        System.out.print("Introduce el maximo de sumas: ");
        numIntro = teclado.nextInt();
        
        suma = 0;
        
        for (k=0; k<numIntro; k=k+1)
        {
            System.out.print("Introduce un numero entero: ");
            num = teclado.nextInt();
            
            suma = suma + num;
        }
        System.out.println("El resultado de todas las sumas es " + suma);
        
        


    }

}
