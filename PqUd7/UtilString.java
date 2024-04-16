package PqUd7;

public class UtilString 
{
    public static String detectaPalabraEscondida(String pCad) throws Exception
    {
        String rdo;
        if(pCad.isEmpty())
        {
            throw new Exception("ERROR.Cadena vacia");
        }
        else
        {                    
            rdo = pCad.replaceAll("w", "");
        }

        return rdo;
    }
}
