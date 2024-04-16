package PqUd6;

public class Disco extends Multimedia
{
    protected String genero;

    public Disco(String pTitulo, String pAutor, String pFormato, int pDuracion, String pGenero) 
    {
        super(pTitulo, pAutor, pFormato, pDuracion);
        this.genero = pGenero;
    }

    public String getGenero() 
    {
        return this.genero;
    }
    
    @Override
    public String getDatos()
    {
        return super.getDatos() + " Genero: " + getGenero();    
    }  
}
