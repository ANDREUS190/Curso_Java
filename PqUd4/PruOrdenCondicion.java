package PqUd4;

public class PruOrdenCondicion 
{
    public static boolean primera(int pNum)
    {
        boolean rdo;
        if(pNum >1)
        {
            rdo = true;
            System.out.println("Entro en primera");
        }
        else
        {
            rdo = false;
        }
        return rdo;
    }
    
    public static boolean segunda(int pNum)
    {
        boolean rdo;
        if(pNum >1)
        {
            rdo = true;
            System.out.println("Entro en segunda");
        }
        else
        {
            rdo = false;
        }
        return rdo;
    }
    
    public static void main(String[] args)
    {
        if ( primera(-1) && segunda(3) )
        {
            System.out.println("Entro en main");
        }
    }
}
