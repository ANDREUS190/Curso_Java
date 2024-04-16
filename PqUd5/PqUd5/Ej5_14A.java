package PqUd5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej5_14A 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        
        System.out.print("Introduce una cadena: ");
        cadena = stdin.readLine();
        
        if (cadena.indexOf("W") != -1)
        {
            System.out.println("La cadena \"" + cadena + "\" contiene la letra \"W\"");
        }
        else
        {
            System.out.println("La cadena \"" + cadena + "\" no contiene la letra \"W\"");
        }       
    }
}
