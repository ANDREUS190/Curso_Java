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
public class Ej2_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    Scanner teclado;
    teclado = new Scanner (System.in);
    
    int num;
    
        System.out.print("\nIntroduce núm. entero: ");
        num = teclado.nextInt();
        
        System.out.println("El numero introducido es: "+num);
    
        
    double numReal;
        System.out.print("\nIntroduce numero real: ");
        numReal=teclado.nextDouble();
        System.out.println("Tu numero real es: "+numReal);
        
    boolean valorLogico;
        System.out.println("\nIntroduce true/false: ");
        valorLogico = teclado.nextBoolean();
        System.out.println("El valor introducido es "+valorLogico);
        
    }
    
}
