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
public class Ej2_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    Scanner teclado;
    teclado= new Scanner (System.in);
    
    double lado,perimetro,area,altura;
    
    System.out.print("Introduzca el lado del triangulo equilatero: ");
    lado= teclado.nextDouble();
    
    perimetro=(3.0*lado);
    altura=Math.sqrt((lado*lado)-((lado/2.0)*(lado/lado)));
    area=(lado*(altura/2.0));
    
    System.out.printf("\nEl area del triangulo del lado %.3f es : %.3f. "+"El perimetro es %.3f.\n", lado,area,perimetro);

    System.out.println("");
    
    
    
    
        
        
        
        
    }
    
}
