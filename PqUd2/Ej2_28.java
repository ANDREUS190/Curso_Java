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
public class Ej2_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    int num;
    boolean numeropar,numeroimpar;
    
        System.out.print("Introduzca un numero: ");
        num= teclado.nextInt();
        
        numeropar= ((num%2)==0);
        numeroimpar= ((num%2)>0);
        System.out.println("\nEl numero " + num + " es par? "+numeropar);
        System.out.println("El numero " + num + " es impar? "+numeroimpar);
                
        
        
        
        
        
               
    }
    
}
