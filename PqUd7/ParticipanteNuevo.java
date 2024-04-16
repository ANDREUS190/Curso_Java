package PqUd7;

import java.util.Arrays;

public class ParticipanteNuevo 
{
    private static double mediaCurso = 0.0;
    protected String numPersonal;
    protected String primerApellido;
    protected String nombre;
    protected int asigMatriculado;
    protected double[] notas;
    protected double media;
    
    public ParticipanteNuevo(String pNumPersonal, String pPrimerApellido, String pNombre, int pAsigMatriculado)
    {
        this.numPersonal = pNumPersonal;
        this.primerApellido = pPrimerApellido;
        this.nombre = pNombre;
        this.asigMatriculado = pAsigMatriculado;  
        this.notas = new double [pAsigMatriculado];
        this.media = 0;
    }

    public String getNumPersonal() 
    {
        return this.numPersonal;
    }
    
    public double getMedia() 
    {
        return this.media;
    }
    
    public String getTodosDatos()
    {
        return ("Nº Personal: " + this.getNumPersonal() + "\nNombre Completo: " + this.nombre + " " + this.primerApellido
                + "\nNumero de Asignaturas: " + this.asigMatriculado + "\nNotas: " + Arrays.toString(this.notas) + "\nMedia: " + this.getMedia());
    } 
    
    public void setNotas(double[] pNotas) throws Exception
    {
        if (pNotas.length != this.asigMatriculado)
        {
            throw new Exception("No coincide las notas con las asignaturas matriculadas");
        }
        
        this.notas = pNotas;
        
        double suma = 0;
        for(int k=0; k<=this.notas.length-1; k=k+1)
        {           
            suma = suma + pNotas[k];
        }
        this.media = (suma / this.asigMatriculado);     
    } 
    
    public static double getMediaCurso(double ...pNotas)
    {
        double media = 0;

        for(double k: pNotas)
        {
            media = media + k;
        }
        media = (media / pNotas.length);
        
        return media;
    }
    
//    public static double visuMediaCurso()
//    {
//        
//    }
}
