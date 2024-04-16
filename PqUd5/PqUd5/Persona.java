package PqUd5;

public class Persona 
{
    String nombreCompleto;
    
    Persona (String ... pNombres) throws Exception
    {
        String resultado;  
        
        if (pNombres.length == 0)
        {
            throw new Exception ("No hay cadenas para formar el nombre");
        }
        
        resultado = "";
        
        for (String temporal : pNombres)
        {
            temporal = temporal.trim() + " ";
            
            resultado = resultado + temporal;
        }
        resultado = resultado.toUpperCase();
        
        this.nombreCompleto = resultado;
    }
    
    public String getNombre()
    {
        return this.nombreCompleto;
    }
}
