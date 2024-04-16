package PqUd7;

import java.util.Arrays;

public class NotasAlumno extends Alumno
{
    private int cantidadNotas;
    private double media;
    private int[] notas;

    public NotasAlumno(String pCodigo, String pNombre, int pCantidadNotas, double pMedia, int[] pNotas) 
    {
        super(pCodigo, pNombre);
        
        this.notas = pNotas;
        this.cantidadNotas = pCantidadNotas;
        this.media = pMedia;     
        this.cantidadNotas = pNotas.length;
    }

    public int getCantidadNotas() 
    {
        return cantidadNotas;
    }

    public double getMedia() 
    {
        return media;
    }

    public int[] getNotas()
    {
        return notas;
    }

    @Override
    public void visualizaDatos()
    {
        super.visualizaDatos();
        System.out.println("\nCant.Notas: " + this.getCantidadNotas() + "\nMedia: " + this.getMedia() + "\nNotas: " + Arrays.toString(this.getNotas()));
    }
}
