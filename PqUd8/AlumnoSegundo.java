package PqUd8;

public class AlumnoSegundo 
{
    private int nota1;
    private int nota2;
    private int nota3;
    private double media;

    public AlumnoSegundo(int pNota1, int pNota2, int pNota3, double pMedia) 
    {
        this.nota1 = pNota1;
        this.nota2 = pNota2;
        this.nota3 = pNota3;
        this.media = pMedia;
    }

    public int getNota1() 
    {
        return nota1;
    }

    public int getNota2() 
    {
        return nota2;
    }

    public int getNota3() 
    {
        return nota3;
    }

    public double getMedia() 
    {
        return media;
    }    
}
