package PqUd6;

public class Consultor extends Trabajador
{
    private int horas;
    private double tarifa;
    
    public Consultor(String pNombre, String pNuss, int pHoras, double pTarifa)
    {
        super (pNombre, pNuss);
        this.horas = pHoras;
        this.tarifa = pTarifa;
    }
    
    @Override
    public String getDatos()
    {
        return "Consultor: " + super.getDatos();
    }
    
    public double calculaPaga()
    {
        double pRdo;
        
        pRdo = (this.horas * this.tarifa);
        
        return pRdo;
    }
}
