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
public class Ej3_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    double saldo, reintegro;
    int respuesta;
    
    System.out.print("Introduzca el saldo de su cuenta: ");
    saldo= teclado.nextDouble();
    
    System.out.print("Introduzca el reintegro que desea realizar: ");
    reintegro= teclado.nextDouble();
    if (reintegro<=saldo)
    {
    System.out.print("¿Esta usted seguro (Si(1)/No(0): ");
    respuesta= teclado.nextInt();
    if (respuesta==1)
    {
    System.out.println("Reintegro realizado");       
    
    }
    
    }
        System.out.println("Hasta la proxima");     
    }
    
}
