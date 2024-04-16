package PqUd7;

public class Trozo extends Frase
{
    private int cantidad;
    private String extraido;
    
    public Trozo(String pTexto, String pExtraido, int pCantidad)
    {
        super (pTexto);
        
        this.extraido = pExtraido;
        this.cantidad = pCantidad;
    }

    public int getCantidad() 
    {
        return cantidad;
    }

    public String getExtraido() 
    {
        return extraido;
    }
    
   @Override
    public void visualizaDatos()
    {
        super.visualizaDatos();
        
        System.out.println("El extraido es: " + this.getExtraido() + " La cantidad es: " + this.getCantidad());
    }
}
 