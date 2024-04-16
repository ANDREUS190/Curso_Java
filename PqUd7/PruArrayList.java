package PqUd7;

import java.util.ArrayList;
import java.util.Collections;

public class PruArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<String> lista = new ArrayList();
        
        lista.add("uno");
        
        for(String cad: lista)
        {
            System.out.println(cad);
        }
        
        lista.add("dos");
        lista.add("tres");
        
        for(String cad: lista)
        {
            System.out.println(cad);
        }
        
        Collections.sort(lista);
        System.out.println("");
        
        for(String cad: lista)
        {
            System.out.println(cad);
        }
        
        System.out.println("Elemento indice 1: " + lista.get(1));
        
        
        for(int k=0; k<=lista.size()-1; k++)
        {
            System.out.println("Elemento indice 1: " + k + ": " + lista.get(k));
        }
//        
//        lista.remove(2);
//        lista.clear();
//        
//        lista.isEmpty();
        System.out.println(lista.indexOf("dos"));
        
    }
}
