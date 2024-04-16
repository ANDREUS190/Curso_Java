/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd8;

/**
 *
 * @author usuario
 */
public class Direccion 
{
    private String cadena;
    private int longitud;

    public Direccion(String pCadena, int pLongitud) 
    {
        this.cadena = pCadena;
        this.longitud = pLongitud;
    }

    //Estos gets no son necesarios pero los creamos para poder mostrar el contenido del objeto desde el botón
    public String getCadena() 
    {
        return this.cadena;
    }

    public int getLongitud() 
    {
        return this.longitud;
    }
    
    
    
}
