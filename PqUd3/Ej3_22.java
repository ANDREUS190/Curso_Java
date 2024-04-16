package PqUd3;

import java.util.Scanner;


public class Ej3_22 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int num;
        
        System.out.println("------ MENU ------");
        System.out.println("1.- Altas.");
        System.out.println("2.- Bajas.");
        System.out.println("0.- Salir.");

        System.out.print("Elige una opción: ");
        num = teclado.nextInt();
        
        
        while ((num!=1) && (num!=2) && (num!=0))
        {
            System.out.println("------ MENU ------");
            System.out.println("1.- Altas.");
            System.out.println("2.- Bajas.");
            System.out.println("0.- Salir.");
            System.out.print("Elige una opción: ");
            num = teclado.nextInt();
        }

  
        switch (num)
        {
            case 1:
            {
                System.out.println("Eligio Altas");
                break;
            }

            case 2:
            {
                System.out.println("Eligio Bajas");
                break;
            }

            case 0:
            {
                System.out.println("Está usted seguro? (S/N)");
                break;
            }
            
            default:
            {
                break;
            }

        } 
    }

}
