package PqUd6;

public class Animal 
{
    protected String raza;
    
    public Animal(String pRaza)
    {
        this.raza = pRaza;
    }
    
    public void visualizaDatos()
    {
        System.out.println("Datos del animal. Raza: " + this.raza);
    }
}
