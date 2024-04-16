package PqUd4;

public class Movil 
{
    String marca;
    String modelo;
    double precio;
    int bateria;
    
    Movil(String pMarca, String pModelo, double pPrecio, int pBateria) throws Exception
    {
        if ((pBateria <200) || (pBateria>1000))
        {
            throw new Exception("Valor de bateria debe estar entre 200 y 1000");
        }
        
        this.marca = pMarca;
        this.modelo = pModelo;
        this.precio = pPrecio;
        this.bateria = pBateria;
    }
    
    //Metodos
    
    public double getPrecio ()
    {
        return this.precio;
    }
    
    public void visualizaPrecio ()
    {
        System.out.println("Precio = " + this.precio);
    }
    
    public void setModeloPrecio (String pModelo, double pPrecio)
    {
        if (pPrecio >= 250)
        {
            this.modelo = "HIGH" + pModelo;
        }
        this.precio = pPrecio;
    }
}
