package PqUd7;

import java.util.Arrays;

public class PruAPIS 
{
    public static void main(String[] args) 
    {
        int[] pArray = new int [20];
        System.out.println(Arrays.toString(pArray));
        
        Arrays.fill(pArray, 7);       
        
        System.out.println(Arrays.toString(pArray));
        
        Arrays.fill(pArray, 1,5,88);
        
        System.out.println(Arrays.toString(pArray));
        
        Arrays.sort(pArray);
        
        System.out.println(Arrays.toString(pArray) + "\n");
        
        int[] arrEnt = {9,8,7,6,5,4,3,2,1};
        
        Arrays.sort(arrEnt,1,3);
        
        System.out.println(Arrays.toString(arrEnt));
        
        Arrays.sort(arrEnt);
        
        System.out.println(Arrays.toString(arrEnt));
        
        
    }
}
