package PqUd5;

public class Ej5_14D 
{
    public static void main(String[] args) 
    {
        String cadena;
        int veces;
        
        veces = 0;
        cadena = "Es bueno dejar la bebida, lo malo es no acordarse donde.";
        
        veces = UtilString.buscaCad(cadena, "da");
        System.out.println("La cadena \"da\" aparece " + veces + " veces.");
        
        veces = UtilString.buscaCad(cadena, "soja");
        System.out.println("La cadena \"soja\" aparece " + veces + " veces.");
        
        
    }
}
