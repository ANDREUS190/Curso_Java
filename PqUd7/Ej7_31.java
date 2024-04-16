package PqUd7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Ej7_31 
{
    public static double getMedia(int[] pArrInt)
    {
        double rdo = 0;
        
        for(int k=0; k<=pArrInt.length-1; k=k+1)
        {
            rdo = rdo + pArrInt[k];
        }
        rdo = rdo/pArrInt.length;
        return rdo;
    }
    
    public static void main(String[] args) throws IOException
    {
        Scanner teclado = new Scanner(System.in);
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        char resp;
        double rdo;
        int[] temporal = new int[5];
        int k = 0;
        
        do
        {
            System.out.print("Introduzca entero: ");
            temporal[k] = teclado.nextInt();
            
            System.out.print("¿Desea introducir más? ");
            resp = (char) stdin.read();
            
            k = k+1;
        }while( (k<temporal.length) && (resp=='S') );
           
        int[] arrInt = new int[k];
        
        arrInt = Arrays.copyOf(temporal, arrInt.length);
        
        rdo = getMedia(arrInt);
        System.out.printf("La media es %.2f", rdo);
    }
}
