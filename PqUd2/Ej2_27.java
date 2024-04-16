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
public class Ej2_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner teclado;
    teclado = new Scanner (System.in);
    
    final int NUMEROSECRETO = 13;
    
    int numero;
    
    System.out.print("Introduzca el num: ");
    numero= teclado.nextInt();
    
        System.out.println("El numero "+ numero +" es mayor que el secreto? "+(numero>NUMEROSECRETO));
        System.out.println("El numero "+ numero +" es menor que el secreto? "+(numero<NUMEROSECRETO));
        System.out.println("El numero "+ numero +" es igual que el secreto? "+(numero==NUMEROSECRETO));
        
        
    }
    
}
