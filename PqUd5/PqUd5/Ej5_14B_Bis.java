package PqUd5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej5_14B_Bis 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        
        do
        {           
            System.out.print("Introduce una cadena: ");
            cadena = stdin.readLine();
            
        }while((cadena.indexOf("W") == -1) || (cadena.indexOf("X") == -1));
    }
}
