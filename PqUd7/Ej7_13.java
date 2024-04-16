package PqUd7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ej7_13 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        Scanner teclado = new Scanner(System.in);
        
        final int MAX_ARRAY = 6;
        int k,num;
        String respLinea;
        respLinea = "";
        k = 0;
        
        int[] arrEnteros = new int [MAX_ARRAY];
        
        do
        {
            System.out.print("Introduzca numero: ");
            num = teclado.nextInt();
            
            arrEnteros[k] = num;
            
            if(k<=MAX_ARRAY-1-1)
            {
                System.out.println("Desea introducir mas?");
                respLinea = entrada.readLine();
            }
            k = k+1;
            
        }while(respLinea.equalsIgnoreCase("S") && (k<=MAX_ARRAY-1));
        
        UtilArray.equilibraArray(arrEnteros);
        
        UtilArray.mostrarArrayPantallaComas(arrEnteros);
    }
}
