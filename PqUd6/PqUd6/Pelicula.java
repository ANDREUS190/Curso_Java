package PqUd6;

public class Pelicula extends Multimedia
{
    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String pTitulo, String pAutor, String pFormato, int pDuracion, String pActorPrincipal, String pActrizPrincipal) throws Exception 
    {
        super(pTitulo, pAutor, pFormato, pDuracion);
        
        if ( (pActorPrincipal.isEmpty() == true) && (pActrizPrincipal.isEmpty() == true) )
        {
            throw new Exception ("Debe de haber al menos un protagonista");
        }
        
        this.actorPrincipal = pActorPrincipal;
        this.actrizPrincipal = pActrizPrincipal;
    }

    public String getActorPrincipal() 
    {
        return this.actorPrincipal;
    }

    public String getActrizPrincipal() 
    {
        return this.actrizPrincipal;
    }
    
    @Override
    public String getDatos()
    {
        return super.getDatos() + " Actor principal: " + this.getActorPrincipal() + " Actriz Principal: " + this.getActrizPrincipal();
    }   
}
