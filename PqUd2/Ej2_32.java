/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd2;

import java.util.Scanner;

/**
 *
 * @author daw14
 */
public class Ej2_32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);   
    
    int num, sumaFamilia, sumaAnimales, contador;
    
    sumaFamilia= 0;
    sumaAnimales= 0;
    num= 0;
    contador=0;
    
    System.out.print("Cuantos abuelos/as tienes? ");
    num= teclado.nextInt();
    sumaFamilia=num+sumaFamilia;
    contador= contador+1;
    
    System.out.print("Cuantos primos/as tienes? ");
    num= teclado.nextInt();
    sumaFamilia=(num+sumaFamilia);
    contador= contador+1;
    
    System.out.print("Cuantos hermanos/as tienes? ");
    num= teclado.nextInt();
    sumaFamilia=(num+sumaFamilia);
    contador= contador+1;
    
    System.out.print("Cuantos perros tienes? ");
    num= teclado.nextInt();
    sumaAnimales=(num+sumaAnimales);
    contador= contador+1;
    
    System.out.print("Cuantos gatos tienes? ");
    num= teclado.nextInt();
    sumaAnimales=(num+sumaAnimales);
    contador= contador+1;
    
   
    System.out.println("\nHabiendo contestado un total de "+ contador+ " preguntas:");
    System.out.println("");
    
    System.out.println("Tienes un total de "+sumaFamilia+" familiares.");
    System.out.println("Tienes un total de "+sumaAnimales+" animales.");

    
    
        
        
    }
    
}
