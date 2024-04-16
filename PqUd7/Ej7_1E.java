package PqUd7;

public class Ej7_1E 
{
    public static void main(String[] args) 
    {
        String cadena = "La cadena es: ";
        
        char[] arrCh1 = {'a','e','i','o','u'};
        
        for (int k=0; k<= arrCh1.length-1; k=k+1)
        {
            cadena = cadena + arrCh1[k]; 
        }
        
        System.out.println(cadena);
    }
}
