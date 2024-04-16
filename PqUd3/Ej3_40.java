package PqUd3;

import java.util.Scanner;


public class Ej3_40 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int opcion;
        
        do
        {
            System.out.println("0.- Juguetes.");
            System.out.println("1.- Moda Infantil.");
            System.out.println("2.- Deportes.");
            System.out.println("");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();
            
        }while((opcion<0) || (opcion>2));
        
        switch (opcion)
        {
            case 0:
            {
                System.out.println("Yendo a planta \"Juguetes\"");
                break;
            }
            
            case 1:
            {
                System.out.println("Yendo a planta \"Moda Infantil\"");
                break;
            }
            
            case 2:
            {
                System.out.println("Yendo a planta \"Deportes\"");
                break;
            }
            
            default:
            {
                break;
            }
        }
            


    }

}
