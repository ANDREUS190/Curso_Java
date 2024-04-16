package PqUd3;

import java.util.Scanner;


public class Ej3_10 
{

    public static void main(String[] args) 
    {
    Scanner teclado = new Scanner(System.in);
    int opcion;
    char respAlt;
    
   
        System.out.println("----MENU----");
        System.out.println("1.- Altas.");
        System.out.println("2.- Bajas.");
        System.out.println("0.- Salir.");
        System.out.println("");
    
        System.out.print("Seleccione una opcion: ");
        opcion = teclado.nextInt();
       
    if ((opcion==1) || (opcion==2))
        {
            if (opcion==1)
                {
                    System.out.println("Eligio Altas");
                }
            
            if (opcion==2)
                {
                    System.out.println("Eligio Bajas");
                }
            
            
        }
        else
            {  
                System.out.println("¿Esta usted seguro? (S/N)");   
            }

    }

}
