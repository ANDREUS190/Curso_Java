package PqUd3;

import java.util.Scanner;


public class Ej3_8 
{

    public static void main(String[] args) 
    {
    Scanner teclado = new Scanner(System.in);
    final int MAYOR_EDAD = 18;
    int edad;
    
    System.out.print("Introduce tu edad: ");
    edad = teclado.nextInt();
    
    if(edad>=MAYOR_EDAD)
    {
        System.out.println("La persona es mayor de edad.");
    }
    else
    {
        System.out.println("La persona es menor de edad.");
    }
    
    
    

    }

}
