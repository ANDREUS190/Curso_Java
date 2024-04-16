/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd2;

/**
 *
 * @author daw14
 */
public class Ej2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    System.out.println("(2+2)*3 es igual a "+(2+2)*3);
    System.out.println("2+2*3 es igual a "+(2+2*3));
    
    System.out.println("1+((2-3)/2 es igual a "+(1+((2-3)/2)));
    System.out.println("1+2-3/2 es igual a "+(1+2-3/2));
    
    System.out.println("(4%2)*4 es igual a "+((4%2)*4));
    System.out.println("4%2*4 es igual a "+4%2*4);
    
    System.out.println("(true&&true)||false es igual a "+((true&&true)||false));
    System.out.println("true&&(true||false) es igual a "+(true&&(true||false)));
    
    System.out.println("(true||false)&&true es igual a "+((true||false)&&true));
    System.out.println("true||(false&&true) es igual a "+(true||(false&&true)));
    }
    
}
