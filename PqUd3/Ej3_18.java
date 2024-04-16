package PqUd3;

import java.util.Scanner;


public class Ej3_18 
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
        
        switch (opcion)
        {
            case (1):
            {
                System.out.println("Eligio Altas");
                break;
            }
            
            case (2):
            {
                System.out.println("Eligio Bajas");
                break;
            }
            default:
            {
                System.out.println("¿Esta usted seguro? (S/N)");
                break;
            }
            
        }
       
         

    }

}
