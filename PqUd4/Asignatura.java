/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd4;

/**
 *
 * @author recatala
 */
public class Asignatura 
{
    //Atributos
    String nombre;   //Conviene que los atributos sean privados 
    String codigo;   // y accesibles con métodos explícitos(getNombre,...).
    int curso;

    // Constructor 
    public Asignatura (String pNombre, 
            String pCodigo, int pCurso)
        throws Exception
    {
        if ((pCurso <1) || (pCurso>5)) // si curso es menor de 1 o mayor de 5
        {
            throw new Exception("Curso debe ser entre 1 y 5.");
        }

        this.nombre = pNombre;
        this.codigo = pCodigo;
        this.curso  = pCurso;
    }

    //Métodos
    String getNombre()
    {
        return this.nombre;  // Métodos accesores(getters) a los atributos.
                        // Típicamente estos métodos se llaman
                        // getAtributo().
    }

    String getCodigo()
    {
        return this.codigo;
    }

    int getCurso()
    { 
        return this.curso;
    }
}
