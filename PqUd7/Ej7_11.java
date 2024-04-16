/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd7;

import java.util.Arrays;

/**
 *
 * @author recatala
 */
public class Ej7_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String[] arrCad;
        
        arrCad = new String[3];
        
        System.out.println(Arrays.toString(arrCad));
        
        arrCad[1] = "Hola";
        System.out.println(Arrays.toString(arrCad));
        
        
        System.out.println(UtilArray.obtenerSumaLongCadArray(arrCad));

        
    }
    
}
