/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd4;

import java.util.Scanner;

/**
 *
 * @author andreu
 */
public class Ej4_2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        Coche coche1;
        
        coche1 = new Coche();
        
        coche1.modelo = "Ibiza";
        coche1.color = "gris";
        
        System.out.print("¿Es metalizada? ");
        coche1.esMetalizado = teclado.nextBoolean();
        
        coche1.matricula = "1234 VCD";
        
        System.out.print("Año de fabricación: ");
        coche1.anyoFabricacion = teclado.nextInt();
        
        System.out.println("Modelo: " 
                + coche1.modelo);
        System.out.println("Color: " + 
                coche1.color);
        
        System.out.println("Metalizado: " 
                + coche1.esMetalizado);
        
        System.out.println("Matrícula: " +
                coche1.matricula);
        System.out.println("Año Fabricación: " 
                + coche1.anyoFabricacion);
    }
    
}
