package PqUd7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ej7_36B 
{
    public static void main(String[] args) 
    {
        Collection<Mueble> colMueble;
        
        colMueble = new ArrayList();
        
        Mueble mue1, mue2, mue3;
        
        mue1 = new Mueble("01", "Es negro");
        mue2 = new Mueble("02", "Es marron");
        mue3 = new Mueble("03", "Es verde");
        
        colMueble.add(mue1);
        colMueble.add(mue2);
        colMueble.add(mue3);
        
        Iterator it;
        
        it = colMueble.iterator();
        Mueble mue;
        
        while(it.hasNext() == true)
        {
            mue = (Mueble) it.next();
            mue.muestraDatos();
            
            it.remove();
        }
    }
}
