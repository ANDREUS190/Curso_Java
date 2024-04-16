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
public class Ej2_34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    boolean resp;
    
    resp=true;
    
    System.out.println("¿Estas diciendo la verdad? true/false: ");
    resp = (resp && teclado.nextBoolean());
    
    System.out.println("¿Sigue diciendo la verdad? true/false: ");
    resp = (resp && teclado.nextBoolean());
    
    System.out.println("¿Continua diciendo la verdad? true/false: ");
    resp = (resp && teclado.nextBoolean());
    
    System.out.println("Usted dijo la verdad? Respuesta: "+resp);
    
    
    
    }
    
}
