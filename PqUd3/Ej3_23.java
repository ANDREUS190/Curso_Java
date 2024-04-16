package PqUd3;

import java.util.Scanner;


public class Ej3_23 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int num;
        
        System.out.print("Introduce un numero del 0 al 100: ");
        num = teclado.nextInt();
        
        while ((num<0) || (num>100))
        {
            System.out.print("Introduce un numero del 0 al 100: ");
            num = teclado.nextInt(); 
        }
        
        System.out.println("El numero introducido es: " + num);


    }

}
