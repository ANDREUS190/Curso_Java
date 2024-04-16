/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd4;


public class Deposito 
{
    //ATRIBUTOS
    String codigo; //codigo identificador
    int cantidad = 100; //cantidad de litros existentes en cada momento
    int capacMax; //Capacidad máxima del depósito
    boolean abierto; //Indica si el depósito está abierto o no
    
    //MÉTODOS
    String getCodigo()
    {  //devuelve el cód. identificador.
        return this.codigo;
    }

    void abreDeposito()
    {//si el depósito está cerrado lo abre.
        if (this.abierto == false)
        {
            this.abierto = true;
        }
    }

    int getCantidad()
    {//  devuelve la cantidad de litros que hay en el depósito.
        return this.cantidad;
    }

                
 }
