package PqUd7;

public class Helado 
{
    private String nombre;
    private String sabor;
    private double precio;

    public Helado(String pNombre, String pSabor, double pPrecio) 
    {
        this.nombre = pNombre;
        this.sabor = pSabor;
        this.precio = pPrecio;
    }

    public String getNombre() 
    {
        return this.nombre;
    }

    public String getSabor() 
    {
        return this.sabor;
    }

    public double getPrecio() 
    {
        return this.precio;
    }
    
    public void visualizaDatos()
    {
        System.out.println("Nombre: " + this.getNombre() + "\nSabor: " + this.getSabor() + "\nPrecio: " + this.getPrecio());
    }    
}
