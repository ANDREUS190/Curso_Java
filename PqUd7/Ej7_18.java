package PqUd7;

import java.util.Arrays;

public class Ej7_18 
{
    public static void main(String[] args) 
    {
        int[][] tabla = new int[3][4];
        
        UtilArray.rellenaMatrizSecuencia(tabla);
        
        for(int m=0; m<=tabla.length-1; m=m+1)
        {
            System.out.println("tabla[m].length: " + tabla[m].length);
            for(int k=0; k<=tabla[m].length-1; k=k+1)
            {
                System.out.println(tabla[m][k]);
            }
        }
        
        System.out.println(Arrays.deepToString(tabla));
    }
}
