package PqUd3;

import java.util.Scanner;


public class Ej3_12 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        int primero, segundo, guardar;
    
    
        System.out.print("Introduzca primer numero: ");
        primero = teclado.nextInt();
        
        System.out.print("Introduzca segundo numero: ");
        segundo = teclado.nextInt();
        System.out.println("");
    
        System.out.println("Antes de intercambio. Primer nº: " + primero + ". Segundo nº: " + segundo);
        System.out.println("");

        guardar = primero;
        primero = segundo;
        segundo = guardar;


        System.out.println("Despues de intercambio. Primer nº: " + primero + ". Segundo nº: " + segundo);
        


    }

}
