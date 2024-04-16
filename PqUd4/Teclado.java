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
public class Teclado 
{
    String codigo;
    char color;
    int longitud;

    
    public Teclado(String pCodigo,
            char pColor,
            int pLongitud) throws Exception 
    {
System.out.println("ENTRÓ 1");
        // Si la longitud es negativa o 0
        // se lanza una excepción, y automáticamente
        // el objeto no se crea(construye)
        // (se suspende la ejecución)
        if(pLongitud <= 0)
        {
            //lanzamos la excepción
            throw new Exception("¡Longitud incorrecta!"); 
        }
        
System.out.println("ENTRÓ 2");
        this.codigo=pCodigo;
        this.color =pColor;
        this.longitud =pLongitud;
    }
}
