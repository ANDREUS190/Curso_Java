package PqUd7;

public class PruArrays 
{
    public static void main(String[] args) 
    {
        int num;
        
        //Declaracion 
        int[] clasificacion;
        
        //dimensionar
        clasificacion = new int [4];
        
        //acceso a los valores de una array
        System.out.println(clasificacion[0]);
        System.out.println(clasificacion[1]);
        System.out.println(clasificacion[2]);
        System.out.println(clasificacion[3]);
        
        clasificacion[1] = 11;
        
        System.out.println(clasificacion[0]);
        System.out.println(clasificacion[1]);
        System.out.println(clasificacion[2]);
        System.out.println(clasificacion[3]);
        
        
        System.out.println(clasificacion.length);
        
        System.out.println("");
        
        for(int k=0; k<=clasificacion.length -1; k=k+1)
        {
            System.out.println(clasificacion[k]);
        }
    }
}
