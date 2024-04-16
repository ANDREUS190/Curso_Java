package PqUd7;

public class Alumno 
{
    protected static int numAlumnos = 0;
    
    protected String codigo;
    protected String nombre;

    public Alumno(String pCodigo, String pNombre) 
    {
        Alumno.numAlumnos = Alumno.numAlumnos + 1;
        this.codigo = pCodigo;
        this.nombre = pNombre;
    }
    
    public String getCodigo() 
    {
        return this.codigo;
    }

    public String getNombre() 
    {
        return nombre;
    }
    
    public void visualizaDatos()
    {
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Nombre: " + this.getNombre());
    }   
}
