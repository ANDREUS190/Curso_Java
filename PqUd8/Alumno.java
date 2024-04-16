package PqUd8;

public class Alumno 
{
    private String codigo;
    private int nota;

    public Alumno(String pCodigo, int pNota) 
    {
        this.codigo = pCodigo;
        this.nota = pNota;
    }

    public String getCodigo() 
    {
        return codigo;
    }

    public int getNota() 
    {
        return nota;
    }   
}
