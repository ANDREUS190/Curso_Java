package PqUd7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PruColeccion 
{
    public static void main(String[] args) 
    {
        Collection<Helado> colHelado; //colhelado es una coleccion de objetos helados
        
        colHelado = new ArrayList(); //con la implementacion de ArrayList
        
        Helado hel1, hel2, hel3;
        hel1 = new Helado("Calipo", "Fresa", 10);
        hel2 = new Helado("Corneto", "Vainilla", 13);
        hel3 = new Helado("Tarrina", "Choco", 11);
        
        //Añadimos elementos a la coleccion
        System.out.println(colHelado.add(hel1));
        System.out.println(colHelado.add(hel2));
        
        System.out.println(colHelado.size());
        
        System.out.println(colHelado.remove(hel2));
        System.out.println(colHelado.remove(hel3));
        
        System.out.println(colHelado.size());
        
        colHelado.removeAll(colHelado);
        
        System.out.println(colHelado.size());
        System.out.println(colHelado.isEmpty());
        
        System.out.println(colHelado.add(hel1));
        System.out.println(colHelado.add(hel2));
        
        System.out.println(colHelado.contains(hel3));
        
//        if(colHelado.contains(hel2)==false)
//        {
//            colHelado.add(hel2);
//        }

        //recorrido
        Iterator it;
        
        Helado hel;
        //creamos un objeto iterator para recorrer la coleccion col helado
        it = colHelado.iterator();
        
        //Recorremos la coleccion mientras exista algun elemento
        while(it.hasNext() == true)
        {
            hel = (Helado) it.next();
            hel.visualizaDatos();
            
            it.remove();
        }
    }
}
