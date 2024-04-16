package PqUd7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ej7_26 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner teclado = new Scanner(System.in);
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        int numNad = 1;
        int edad;
        String nombre, apellidos;
        
        Nadador[] nad = new Nadador[12];
        
        for(int k=0; k<=nad.length-1; k=k+1)
        {         
            System.out.print("Nombre nadador " + numNad + ": ");
            nombre = stdin.readLine();
            
            System.out.print("Apellidos nadador " + numNad + ": ");
            apellidos = stdin.readLine();
            
            System.out.print("Edad nadador " + numNad + ": ");
            edad = teclado.nextInt();
            
            nad[k] = new Nadador(nombre, apellidos, edad);
            
            System.out.println("");
            numNad = numNad + 1;  
        }
        
        System.out.println("");
        Nadador.generaCategorias(nad);
    }
}
