package PqUd6;

public class Trabajador 
{
    protected String nuss;
    protected String nombre;
    private String puesto;
    private String direccion;
    private int telefono;
    private String fechaNacimiento;
    private String fechaContratacion;
    
    public Trabajador(String pNuss, String pNombre)
    {
        this.nuss = pNuss;
        this.nombre = pNombre;
    }
    
    public String getDatos()
    {
        return "Nombre: " + this.nombre + "  NUSS: " + this.nuss;
    }
    
    public boolean esIgual(Trabajador pTrab1, Trabajador pTrab2)
    {
        boolean resultado;
        
        resultado = pTrab1.nuss.equals(pTrab2.nuss); 
        
        return resultado;
    }
}
