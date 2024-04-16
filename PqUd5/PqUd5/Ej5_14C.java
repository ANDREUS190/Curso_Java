package PqUd5;

public class Ej5_14C 
{
    public static void main(String[] args) 
    {
        String cadena;
        int veces, pos;
        
        veces = 0;
        cadena = "Es bueno dejar la bebida, lo malo es no acorsarse donde";
        
        pos = cadena.indexOf("b",0);
        //Mientras la encuentre
        while(pos != -1)
        {
            veces = (veces + 1);
            //Buscamos a partir de la posicion donde lo encontro
            pos = cadena.indexOf("b", (pos +1));
        }
        System.out.println("La letra \"b\" aparece " + veces + " veces.");
    }
} 
