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
public class Ej2_35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num, rdo, contador;
    
    num=0;
    rdo=0;
    contador=1;
    System.out.print("Introduzca un numero "+(contador)+": ");
        num= teclado.nextInt();
        rdo= (rdo+num);
        contador=(contador+1);
        
    System.out.print("Introduzca un numero "+(contador)+": ");
        num= teclado.nextInt();
        rdo= (rdo+num);
        contador=(contador+1);
        
    System.out.print("Introduzca un numero "+(contador)+": ");
        num= teclado.nextInt();
        rdo= (rdo+num);
        contador=(contador+1);
        
    System.out.print("Introduzca un numero "+(contador)+": ");
        num= teclado.nextInt();
        rdo= (rdo+num);
        contador=(contador+1);
        
    System.out.print("Introduzca un numero "+(contador)+": ");
        num= teclado.nextInt();
        rdo= (rdo+num);
        contador=(contador+1);
        
    System.out.print("Introduzca un numero "+(contador)+": ");
        num= teclado.nextInt();
        rdo= (rdo+num);
        
    rdo= (rdo/contador);
    System.out.println("La media de los "+contador+" numeros introducidos es: "+rdo);
    
    
    
        
        
        
        
    
        
        
    }
    
}
