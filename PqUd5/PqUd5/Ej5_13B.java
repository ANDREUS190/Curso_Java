package PqUd5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ej5_13B 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        
        System.out.print("Introduzca frase: ");
        cadena = stdin.readLine();

        System.out.println(UtilString.cuentaConson(cadena));
        
        System.out.println(UtilString.esConson('a'));
    }
}
