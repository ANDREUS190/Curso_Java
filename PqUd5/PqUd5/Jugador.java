package PqUd5;

public class Jugador 
{
    String nombre;
    String apellido;
    
    public Jugador (String ... pNombre) throws Exception
    {
        if ((pNombre.length < 2))
        {
            throw new Exception ("Insuficientes cadenas para formar el nombre completo");
        }
                
        this.nombre = pNombre[0].toUpperCase();
        this.apellido = pNombre[1].toUpperCase();
    } 
    
    void setNombre(String pCad)
    {
        this.nombre = pCad;
    }
    
    void setApellido(String pCad)
    {
        this.apellido = pCad;
    }
    
    String getNombre()
    {
        return this.nombre;
    }
    
    String getApellido()
    {
        return this.apellido;
    }
    
    
    void muestraNombreCompleto()
    {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
    }
}
