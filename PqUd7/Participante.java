package PqUd7;

import java.util.Arrays;

public class Participante 
{
    private String numPersonal;
    private String primerApellido;
    private String nombre;
    private int asigMatriculado;
    private double[] notas;
    private double media;
    
    public Participante(String pNumPersonal, String pPrimerApellido, String pNombre, int pAsigMatriculado)
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
    
    public static double getMediaCursoObj(Participante... pPart)
    {
        double rdo, suma;
        suma = 0;
        
        for(int k=0; k<=pPart.length-1; k=k+1)
        {
            suma = suma + pPart[k].getMedia();
        }
        rdo = suma / pPart.length;
        
        return rdo;
    }
}
