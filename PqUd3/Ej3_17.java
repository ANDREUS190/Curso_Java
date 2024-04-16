package PqUd3;

import java.util.Scanner;

public class Ej3_17 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int nota;
        
        System.out.print("Introduce la nota: ");
        nota = teclado.nextInt();
        
        switch (nota)
        {
            case (1): case (2): case (3): case (4):
            {
                System.out.println("Suspendido " + nota);
                break;
            }
            
            case (5):
            {
                System.out.println("Aprobado " + nota);
                break;
            }
            
            case (6):
            {
                System.out.println("Bien " + nota);
                break;
            }
            
            case (7): case (8):
            {
                System.out.println("Notable " + nota);
                break;
            }
            
            case (9): case (10):
            {
                System.out.println("Sobresaliente " + nota);
                break;
            }
            
            default:
            {
                nota = (-1);
                System.out.println("No presentado " + nota);
                break;
            }        
            
        }              
        
    }

}
