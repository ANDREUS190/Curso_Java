package PqUd6;

public class Multimedia 
{
    protected String titulo;
    protected String autor;
    protected String formato;
    protected int duracion;
    
    public Multimedia(String pTitulo, String pAutor, String pFormato, int pDuracion)
    {
        this.titulo = pTitulo;
        this.autor = pAutor;
        this.formato = pFormato;
        this.duracion = pDuracion;
    }

    public String getTitulo() 
    {
        return this.titulo;
    }

    public String getAutor() 
    {
        return this.autor;
    }

    public String getFormato() 
    {
        return this.formato;
    }

    public int getDuracion() 
    {
        return this.duracion;
    }
    
    public String getDatos()
    {
        return "Titulo: " + this.getTitulo() + " Autor: " + this.getAutor() + " Formato: "
                + this.getFormato() + " Duracion: " + this.getDuracion();
    }
    
    public boolean esIgual(Multimedia multi)
    {
        boolean rdo;
        
        rdo = false; 

        if ((this.getTitulo().equals(multi.getTitulo())) && (this.getAutor().equals(multi.getAutor())))
        {
            rdo = true;
        }
        
       return rdo;
    }
}
