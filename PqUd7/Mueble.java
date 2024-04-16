package PqUd7;

public class Mueble 
{
    protected String codigo;
    protected String descripcion;

    public Mueble(String pCodigo, String pDescripcion) 
    {
        this.codigo = pCodigo;
        this.descripcion = pDescripcion;
    }

    public String getCodigo() 
    {
        return codigo;
    }

    public String getDescripcion() 
    {
        return descripcion;
    }

    public void setCodigo(String pCodigo) 
    {
        this.codigo = pCodigo;
    }

    public void setDescripcion(String pDescripcion) 
    {
        this.descripcion = pDescripcion;
    }

    public int cuentaBlancos()
    {
        int rdo = 0;
        
        for(int k=0; k<=this.descripcion.length()-1; k++)
        {
            if(this.descripcion.charAt(k) == ' ')
            {
                rdo = rdo + 1;
            }
        }
        
        return rdo;
    }
    
    public void muestraDatos()
    {
        System.out.println("Código del mueble: " + this.getCodigo() + "\nDescripción del mueble: " + this.getDescripcion());
    }
}
