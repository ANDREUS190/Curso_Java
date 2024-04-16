package PqUd5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej5_19Bis 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String dni;
        
        System.out.print("Introduce NIF: ");
        dni = stdin.readLine();
        
        System.out.println(UtilString.compruebaNIFBis(dni));
    }
}
