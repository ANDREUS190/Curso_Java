package PqUd6;

public class Persona 
{
    private String nombre;
    private int edad;
    
    public Persona (String pNombre, int pEdad)
    {
        this.nombre = pNombre;
        this.edad = pEdad;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public int getEdad()
    {
        return this.edad;
    }
    
    public void visualiza()
    {
        System.out.println("Datos personales: " + this.getNombre() + " " + this.getEdad());
    }

    public void imprime()
    {
        System.out.println ("Datos personales: " + this.getNombre()  + "  " + this.getEdad() );
    }
}
