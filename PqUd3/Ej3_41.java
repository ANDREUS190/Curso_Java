package PqUd3;

import java.util.Scanner;


public class Ej3_41 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int n, opcionUsu, contador, suma;
        
        n = 2;
        suma = 0;
        contador = 0;
        
        System.out.print("Introduce un numero: ");
        opcionUsu = teclado.nextInt();
        
        do
        {
            contador = contador + 1;
            System.out.print(n + " ");
            suma = suma + n;
            n = n + 2;
            
        }while (opcionUsu!=contador);
        
        System.out.println("");
        System.out.printf("La suma de los " + opcionUsu + " numeros pares es " + suma);
        System.out.println("");


    }

}
