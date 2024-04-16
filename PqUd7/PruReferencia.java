package PqUd7;

import java.util.Arrays;

public class PruReferencia 
{
    public static void main(String[] args) 
    {
        int[] arrayNumeros = {0,1,2,3,4,5,6,7,8,9};
        
        System.out.println(arrayNumeros[0]);
        System.out.println(arrayNumeros[3]);
           
        UtilArray.modificaArray(arrayNumeros);
        
        System.out.println("Numeros modificados: ");
        System.out.println(arrayNumeros[0]);
        System.out.println(arrayNumeros[3]);
    }
}
