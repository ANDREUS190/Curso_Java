package PqUd7;

import java.util.Arrays;

public class PruCopyOf 
{
    public static void main(String[] args) 
    {
        int[] arrEnt = {1,2,3};
        
        int[] arrCopia;
        
        arrCopia = Arrays.copyOf(arrEnt, arrEnt.length);
        
        System.out.println(Arrays.toString(arrEnt));
        
        System.out.println(Arrays.toString(arrCopia));
        
        arrCopia[2] = 99;
        
        System.out.println(Arrays.toString(arrEnt));
        
        System.out.println(Arrays.toString(arrCopia));
        
    }
}
