package PqUd3;

import java.util.Scanner;


public class Ej3_24 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int k, num, suma;
        
        suma = 0;
        k = 1;
        
        System.out.print("Introduce numero: ");
        num = teclado.nextInt();
        
        
        while (k<=num)
        {
            suma = suma + k;
            
            k = k + 1;
        }
        
        System.out.println("La suma es: " + suma);

    }

}
