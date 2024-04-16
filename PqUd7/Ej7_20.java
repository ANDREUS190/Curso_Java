package PqUd7;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7_20 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int n, mitad;
        
        //a
        int[] arrEntA = new int[30];
        
        Arrays.fill(arrEntA, 10, 20, 1);
        
        System.out.println(Arrays.toString(arrEntA));
        
        
        //b
        System.out.print("Introduce numero de caracteres: ");
        n = teclado.nextInt();
                
        char[] arrCharB = new char[n];
        mitad = n/2;
        
        Arrays.fill(arrCharB, 0,mitad,'a');
        Arrays.fill(arrCharB, mitad,arrCharB.length,'b');
        
        System.out.println(Arrays.toString(arrCharB));
        
        //c
        int resta = 9;
        int[] arrEntC = new int[10];
        for(int k=0; k<=arrEntC.length-1; k=k+1)
        {
            arrEntC[k]= resta;
            resta = resta-1;
        }
        Arrays.sort(arrEntC);
        System.out.println(Arrays.toString(arrEntC));
    }
}
