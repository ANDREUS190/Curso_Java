package PqUd3;

import java.util.Scanner;


public class Ej3_29A 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int num, cant, k;
        String cadena;
        
        cadena = "";
        
        System.out.print("Introduce la cantidad de numeros que se le va a pedir: ");
        cant = teclado.nextInt();
        
        k = 1;
        
        while (k<=cant)
        {
            System.out.print("Introduzca nº: ");
            num = teclado.nextInt();
            k = k + 1;
        }
        
        System.out.println("La cadena resultante es: " + cadena);
                
        
        


    }

}
