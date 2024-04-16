package PqUd4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ej4_22A 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner teclado = new Scanner(System.in);
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        String linea, frase;
        char opcion;
        
        frase = "";
        
        do
        {
            System.out.print("Introduce frase: "); 
            frase = frase + stdin.readLine();
            
            System.out.println("¿Desea escribir mas?");
            linea = stdin.readLine();
            opcion = linea.charAt(0);
                         
        }while (opcion == 'S');
        
        System.out.println(frase);
    }
}
