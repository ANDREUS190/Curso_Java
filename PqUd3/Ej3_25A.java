package PqUd3;

import java.util.Scanner;


public class Ej3_25A 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int suma, num, numTope, k;
        
        suma = 0;
        num = 2;
        k = 1;
        
        System.out.print("Introduce un numero: ");
        numTope = teclado.nextInt();
       
        while (k<=numTope)
        {
            suma = suma + num;
            num = num + 1;
            k = k + 1;
            
        }
        System.out.println("La suma de los " + numTope + " primeros numeros es " + suma);

    }

}
