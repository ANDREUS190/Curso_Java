package PqUd6;

public class Administrativo extends Trabajador
{
    private double impuestos;
    private double sueldo;
    
    public Administrativo(String pNombre, String pNuss, double pSueldo)
    {
        super(pNombre, pNuss);  
        final double PORCENTAJE_IMPUESTOS = 0.03;
        this.sueldo = pSueldo;
        this.impuestos = PORCENTAJE_IMPUESTOS * this.sueldo;
    }

    @Override
    public String getDatos()
    {
        return ("Administrativo: " + super.getDatos());
    }
    
    public double calculaPaga()
    {
        final int PAGAS=14;
        double pRdo;
        
        pRdo = ((this.sueldo - this.impuestos)/PAGAS);
        
        return pRdo;
    }
            
}
