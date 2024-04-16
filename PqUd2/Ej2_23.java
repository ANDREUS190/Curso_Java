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
public class Ej2_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    Scanner teclado;
    teclado= new Scanner(System.in);
    
    int hora, minutos, segundos;
    
    System.out.print("\nIntroduce la hora: ");
    hora= teclado.nextInt();
    
    System.out.print("\nIntroduce los minutos: ");
    minutos= teclado.nextInt();
    
    System.out.print("\nIntroduce los segundos: ");
    segundos= teclado.nextInt();
    
    System.out.println("La hora es: " + hora +":" +minutos+ ":" +segundos);
        
        
        
    }
    
}
