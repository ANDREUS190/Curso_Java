package PqUd4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ej4_22B 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner teclado = new Scanner(System.in);
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String linea;
        char opcion;
        int km;
        
        do
        {        
        System.out.println("---MENU---");
        System.out.println("A.- Adelanta");
        System.out.println("F.- Frena");
        System.out.println("P.- Paradas Kilometricas\n");
        System.out.println("S.- Salir\n");
        System.out.print("Elige una opcion: ");
        linea = stdin.readLine();
        opcion = linea.charAt(0);
        }while((opcion !='A') && (opcion !='F') && (opcion !='P') && (opcion !='S'));
        
        if (opcion == 'P')
        {
            System.out.println("");
            System.out.println("Cuantos kilometros has hecho? ");
            km = teclado.nextInt();
            
            System.out.println("");
            
            System.out.println("Tus paradas debieron ser: ");
            
            for (int k=0; k<=km; k = k+50)
            {
                System.out.print(k + "-");
            }
        }
    }
}
