package PqUd5;

public class Elemento 
{
    //Elementos de clase
    static int numElementos = 0;
            
    static int getNumEltos()
    {
        return Elemento.numElementos;
    }
    
    static void muestraDatos()
    {
        System.out.println("Elementos creados: " + Elemento.getNumEltos());
    }
    
    //Atributos
    String nombre;
    
    //Constructor
    Elemento (String pNombre)
    {
        Elemento.numElementos = Elemento.getNumEltos() + 1;
        
        this.nombre = pNombre;
    }
    
}
