package PqUd7;

public class Ej7_5 
{
    public static void main(String[] args) 
    {
        int[] clasificacion = {2,4,9,12};
        
        UtilArray.completaArrayIndice(clasificacion);
        
        for(int k=0; k<=clasificacion.length -1; k=k+1)
        {
            System.out.println(clasificacion[k]);
        }
    }
}
