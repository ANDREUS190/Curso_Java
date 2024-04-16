package PqUd7;

public class Ej7_15 
{
    public static void main(String[] args) 
    {
        String pCad = "Macdonalds";
        char[] arrChar;
        
        arrChar = UtilArray.convCadArray(pCad);
        
        for(int k=0; k<=arrChar.length-1; k=k+1)
        {
            System.out.println(arrChar[k]);
        }
    }
}
