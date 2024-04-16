package PqUd8;

public class Persona 
{
    private String nombre;
    private String apellidos;
    private int edad;
    private int telefono;

    public Persona(String pNombre, String pApellidos, int pEdad, int pTelefono) 
    {
        this.nombre = pNombre;
        this.apellidos = pApellidos;
        this.edad = pEdad;
        this.telefono = pTelefono;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public String getApellidos() 
    {
        return apellidos;
    }

    public int getEdad() 
    {
        return edad;
    }

    public int getTelefono() 
    {
        return telefono;
    }        
}
