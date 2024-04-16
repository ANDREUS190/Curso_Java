package PqUd7;

public class Utilidades 
{
    public static char[] cortaFrase(String pTexto, int pCantidad)
    {
        String cad = "";
        char[] rdo = new char[pCantidad];
        
        for(int k=0; k<=pTexto.length(); k=k+1)
        {
            if(k < pCantidad)
            {
                rdo[k] = pTexto.charAt(k);
            }     
        }

        return rdo;
    }
}
