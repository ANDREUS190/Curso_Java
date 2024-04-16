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
public class Ej2_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    Scanner teclado;
    teclado= new Scanner(System.in);
    
    int segundosiniciales,segundos,horas,minutos,dias;
    
    System.out.print("Introduce los segundos que quieras: ");
    segundosiniciales= teclado.nextInt();
    
    minutos = (segundosiniciales/60);
    segundos = (segundosiniciales%60);
    
    horas=(minutos/60);
    minutos= (minutos%60);
    
    dias=(horas/24);
    horas=(horas%24);
    
    System.out.println(segundosiniciales+" segundos son " + dias + 
    " dias, "+ horas+" horas, "+minutos+" minutos y "+segundos+" segundos.");
       
    
    
    
    
    
        
        
        
        
        
        
    }
    
}
