package PqUd7;

public class Silla extends Mueble
{
    private boolean pintada = false;

    public Silla(String pCodigo, String pDescripcion) 
    {
        super(pCodigo, pDescripcion);   
    }    

    public boolean getPintada() 
    {
        return pintada;
    }
    
    @Override
    public void muestraDatos()
    {
        super.muestraDatos();
        
        System.out.println("Pintada: " + this.pintada);
    }    
}
