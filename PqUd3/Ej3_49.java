package PqUd3;


public class Ej3_49 
{

    public static void main(String[] args) 
    {
        int numFor, numWhile, numDo;
        
        for (numFor=1; numFor<=100; numFor=numFor+1)
        {
            System.out.print(numFor + " ");
        }
        
        System.out.println("");
        System.out.println("");
        
        numWhile = 1;
        while (numWhile<=100)
        {
            System.out.print(numWhile + " ");
            numWhile = numWhile + 1;
        }
        
        System.out.println("");
        System.out.println("");
        
        numDo = 1;
        do
        {
            System.out.print(numDo + " ");
            numDo = numDo + 1;
        }while (numDo<=100);
        


    }

}
