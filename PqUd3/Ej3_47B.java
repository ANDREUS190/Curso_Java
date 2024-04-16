package PqUd3;

import java.util.Scanner;


public class Ej3_47B 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int edad, num, cuadradoEdad, cuadradoNum;
        
        System.out.print("Introduce tu edad: ");
        edad = teclado.nextInt();
        
        cuadradoEdad = edad * edad;

        
        if (edad>=18)
        {
            do
            {
                System.out.print("Introduce un numero: ");
                num = teclado.nextInt();
                
                cuadradoNum = (num * num);

                System.out.println("Cuad.: " + cuadradoNum);
                
            } while (num!=cuadradoEdad);
            System.out.println("Has acertado");
        }


    }

}
