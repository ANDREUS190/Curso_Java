/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author recatala
 */
public class PruCapturaCaracteres 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        //buff
        char caracter;
        String linea;
        
        System.out.println("Introduce la línea: ");
        linea = stdin.readLine();
        
        System.out.println("La linea es: " + linea);
        
        caracter = linea.charAt(0);
        System.out.println(caracter);
        
    }
    
}
