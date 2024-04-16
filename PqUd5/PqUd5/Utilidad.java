/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd5;

/**
 *
 * @author recatala
 */
public class Utilidad 
{
    public static double mediaReal (int...pNumeros) throws Exception
    {
        double suma,rdo;
        
        String cad;

        rdo = 0.0;
        suma =0.0; 
        cad = "";
        
        
        //Si NO hay parámetros
        if (pNumeros.length == 0)
        {
            throw new Exception ("¡No se introdujo ningún número!.");
        }    
        
        
        for (int num : pNumeros)
        {
            suma = suma + num;
            cad = cad + num + ", ";
        }
        
        rdo = (suma / pNumeros.length);
        
        System.out.println("Se han introducido "+ cad + "un total de " 
                + pNumeros.length +" nºs.");

        return rdo;
    }
}
