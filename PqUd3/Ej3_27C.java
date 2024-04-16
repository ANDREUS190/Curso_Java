package PqUd3;

import java.util.Scanner;


public class Ej3_27C 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int opcion, edad;
        
        System.out.println("VARIOPINTO.");
        System.out.println("1.- Uno");
        System.out.println("2.- Dos");
        System.out.println("3.- Edad");
        System.out.println("0.- Nada");
        
        System.out.print("Elige una opción: ");
        opcion = teclado.nextInt();
        
        while ((opcion<0) || (opcion>3))
        {
            System.out.println("VARIOPINTO.");
            System.out.println("1.- Uno");
            System.out.println("2.- Dos");
            System.out.println("3.- Edad");
            System.out.println("0.- Nada");
        
        System.out.print("Elige una opción: ");
        opcion = teclado.nextInt(); 
        }
        
        switch (opcion)
        {
            case 1:
            {
                System.out.println("Elegistes 1.");  
                break;
            }
            
            case 2:
            {
                System.out.println("Elegistes 2.");  
                break;
            }
            
            case 3:
            {
                System.out.print("Introduce tu edad: ");
                edad = teclado.nextInt();
                
                if ((edad%2)!=0)
                {
                    System.out.println("Eres impar");
                }
                else
                {
                    System.out.println("Tu edad es " + edad);
                } 
            }
            
            default:
            {
                break;
            }
        }

        
        

    }

}
