package PqUd7;

public class Ej7_1C 
{
    public static void main(String[] args) 
    {
        int[] arrDig2;
        int cont = 9;
        
        arrDig2 = new int [10];
        
        for(int k=0; k<=arrDig2.length-1 ; k=k+1)
        {
            arrDig2[k] = cont;
            cont = cont - 1;
        }
        
        for(int k=0; k<=arrDig2.length-1 ; k=k+1)
        {
            System.out.println(arrDig2[k]);
        }
    }
}
