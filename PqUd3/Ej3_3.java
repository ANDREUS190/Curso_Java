/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd3;

import java.util.Scanner;

/**
 *
 * @author daw14
 */
public class Ej3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    int numero1, numero2;
    
    System.out.print("Introduce tu numero entero: ");
    numero1= teclado.nextInt();
    
    System.out.print("Introduce tu segundo numero entero: ");
    numero2= teclado.nextInt();
    
    if (((numero1%2)!=0) && ((numero2%2)!=0))
    {
     System.out.println("IMPARES");
    
    }
    
        
    }
    
}
