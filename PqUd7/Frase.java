package PqUd7;

public class Frase 
{
    protected String texto;

    public Frase(String pTexto) 
    {
        this.texto = pTexto;
    }

    public String getTexto() 
    {
        return texto;
    }
     
    public void visualizaDatos()
    {
        System.out.println("El texto es: " + this.getTexto());
    }
}
