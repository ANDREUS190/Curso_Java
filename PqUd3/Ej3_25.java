package PqUd3;

import java.util.Scanner;


public class Ej3_25 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int k, num, suma, numTope;
        
        suma = 0;
        
        System.out.print("Introduce un numero: ");
        numTope = teclado.nextInt();
        
        k = 1;
        num = 14;
        
        while (k<= numTope)
        {
            suma = (suma + num);
            num = num + 1;
            k = k + 1;
        }
        System.out.println("La suma de los " + numTope + " primeros numeros es de " + suma);

    }

}
