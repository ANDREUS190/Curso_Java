package PqUd7;

public class Equipo 
{
    private String nombre;
    private String ciudad;

    public Equipo(String pNombre, String pCiudad) 
    {
        this.nombre = pNombre;
        this.ciudad = pCiudad;
    }

    public String getNombre() 
    {
        return this.nombre;
    }

    public void setNombre(String pNombre) 
    {
        this.nombre = pNombre;
    }

    public String getCiudad() 
    {
        return this.ciudad;
    }

    public void setCiudad(String pCiudad) 
    {
        this.ciudad = pCiudad;
    }
}
