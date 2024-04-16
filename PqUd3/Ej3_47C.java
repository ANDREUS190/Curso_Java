package PqUd3;

import java.util.Scanner;


public class Ej3_47C 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int edad, num, cuadradoNum, cuadradoEdad;
        
        System.out.print("Introduce tu edad: ");
        edad = teclado.nextInt();
        
        cuadradoEdad = (int) Math.pow(edad, 2);
        
        
        
        if (edad>=18)
        {
            do
            {
                System.out.print("Introduce un numero: ");
                num = teclado.nextInt();
                
                cuadradoNum = (int) Math.pow(edad, 2);
                
                System.out.println("Cuad.: " + num);
                
            } while (num!=cuadradoEdad);
            System.out.println("Has acertado");
        }


    }

}
