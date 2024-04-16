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
public class Ej2_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    Scanner teclado;
    teclado= new Scanner (System.in);
      
    final double PI=3.14159265;
    double altura, radio, area;
    
    System.out.println("---Introduzca los datos del cilindro---");
    System.out.print("Radio: ");
    radio= teclado.nextDouble();
    
    System.out.print("Altura: ");
    altura= teclado.nextDouble();
    
    area =((2*PI*(radio*radio))+(2*PI*radio*altura));
    System.out.println("");
    
    System.out.printf("El area es: %.2f.\n", area);
    
    }
    
}
