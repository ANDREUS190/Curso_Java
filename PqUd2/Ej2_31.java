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
public class Ej2_31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double suma, num;
    suma=0.0;
    
    System.out.print("Introduzca un numero real 1: " );
    num= teclado.nextDouble();
    suma= (suma+num);
    
    System.out.print("Introduzca un numero real 2: " );
    num= teclado.nextDouble();
    suma= (suma+num);
    
    System.out.print("Introduzca un numero real 3: " );
    num= teclado.nextDouble();
    suma= (suma+num);
    
    System.out.print("Introduzca un numero real 4: " );
    num= teclado.nextDouble();
    suma= (suma+num);
    
    System.out.print("Introduzca un numero real 5: " );
    num= teclado.nextDouble();
    suma= (suma+num);
    
    System.out.printf("La suma de todos los numero es %.1f: ",suma);
    
    }
    
}
