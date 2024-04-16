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
public class Ej2_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    final double PI=3.14159265;
    double diametro, altura, radio, area, volumen;
    
    diametro=15.5;
    altura=42.4;
    
    radio =(diametro/2);
    area =((2*PI*(radio*radio))+(2*PI*radio*altura));
    volumen =(PI*(radio*radio)*altura);
    
    System.out.print("Para un cilindro de radio "+radio);
    System.out.println(" y altura "+altura);
    System.out.println("El area es: "+area);
    System.out.println("El volumen es: "+volumen);
    

        
        
        
        
    }
    
}
