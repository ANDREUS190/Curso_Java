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
public class Ej2_31B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double suma, num;
    int contador;
    
    suma=0.0;
    contador=1;
        
    System.out.print("Introduzca un numero real "+contador+": " );
    num= teclado.nextDouble();
    suma= (suma+num);
    contador=(contador+1);
    
     System.out.print("Introduzca un numero real "+contador+": " );
    num= teclado.nextDouble();
    suma= (suma+num);
    contador=(contador+1);
    
     System.out.print("Introduzca un numero real "+contador+": " );
    num= teclado.nextDouble();
    suma= (suma+num);
    contador=(contador+1);
    
     System.out.print("Introduzca un numero real "+contador+": " );
    num= teclado.nextDouble();
    suma= (suma+num);
    contador=(contador+1);
    
     System.out.print("Introduzca un numero real "+contador+": " );
    num= teclado.nextDouble();
    suma= (suma+num);
    contador=(contador+1);

    
    System.out.printf("La suma de todos los numero es %.1f: ",suma);
    
    }
    
}
