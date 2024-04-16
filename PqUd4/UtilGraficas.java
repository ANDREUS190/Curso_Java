package PqUd4;

public class UtilGraficas 
{
    public static void dibujaLineaParam(char pCaract, int pNumVeces)
    {
        for (int k = 0;  k<pNumVeces; k=k+1) 
        {
            System.out.print(pCaract);
        }
    }
    
    public static void dibujaGuion()
    {
        dibujaLineaParam('-',1);
    }
    
    public static void dibujaLinea()
    {
        dibujaLineaParam('-',80);
    }
    
    public static void dibujaEquilatero(char pCaract, int pLado)
    {
        for (int k=1; k<=pLado; k=k+1) 
        {
            dibujaLineaParam(pCaract,k);
            System.out.println("");
        }
    }  
}
