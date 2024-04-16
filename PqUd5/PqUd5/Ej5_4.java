package PqUd5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej5_4 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        String linea;
        char opcion;
        
        do
        {  
            System.out.print("Introduce un caracter: ");
            linea = stdin.readLine();
            opcion = linea.charAt(0);
        
            System.out.print("'" + opcion + "'");
            if (Character.isLetter(opcion) == true)
            {
                System.out.print(" si ");
            }
            else
            {
                System.out.print(" no ");
            }
            System.out.println("es una letra.");
            System.out.println("");
            
        }while(opcion != 'S');      
    }
}
