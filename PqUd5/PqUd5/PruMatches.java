package PqUd5;

public class PruMatches 
{
    public static void main(String[] args) 
    {
        char letra;
        String cad;
                
        letra = 'a';
        //Convertimos la letra 'a' al String "a"
        cad = "" + letra; // cad = "" + 'a';
        
        //Aplicamos el metodo matches () a la cadena cad("a")
        System.out.println(cad.matches("[a|á|à]"));
    }
}
