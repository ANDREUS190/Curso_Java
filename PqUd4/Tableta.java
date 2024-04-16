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
public class Tableta 
{
    //ATRIBUTOS
    String marca;
    String modelo;
    int precio;
    
    //CONSTRUCTORES
    public Tableta(String pMarca, String pModelo, int pPrecio, String pPrefijo)
    {
        this.marca = pPrefijo + pMarca;
        this.modelo = pModelo;
        this.precio = pPrecio;
    }
    
    
    public Tableta(String clave)
    {
        this.marca = clave;
    }
}
