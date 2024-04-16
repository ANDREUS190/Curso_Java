package PqUd7;

import java.util.Arrays;

public class Ej7_21 
{
    public static void main(String[] args) 
    {
        //a
        String[] arrStr = {"impresora","peto","mar","orilla","Orihuela"};
        System.out.println(Arrays.toString(arrStr));
        
        //b
        Arrays.sort(arrStr);        
        System.out.println(Arrays.toString(arrStr));
        
        //c
        Arrays.sort(arrStr, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(arrStr));
    }
}
