package PqUd7;

public class Jugador 
{
    private String nombre;
    private String dorsal;

    public Jugador(String pNombre, String pDorsal) 
    {
        this.nombre = pNombre;
        this.dorsal = pDorsal;
    }

    public String getNombre() 
    {
        return this.nombre;
    }

    public void setNombre(String pNombre) 
    {
        this.nombre = pNombre;
    }

    public String getDorsal() 
    {
        return this.dorsal;
    }

    public void setDorsal(String pDorsal) 
    {
        this.dorsal = pDorsal;
    }  
}
