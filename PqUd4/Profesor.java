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
public class Profesor 
{
    String nombre;
    int edad;
    String grupo;
    String modulo;

    void visualizaDatos()
    {
        System.out.println(this.nombre);
        System.out.println(this.getEdad());
        System.out.println(this.grupo);
        System.out.println(this.modulo);
    }

    void setGrupo(String pGrupo)
    {
        this.grupo = pGrupo;
    }

    int getEdad()
    {
        return this.edad;
    }
    
    void setEdad(int pEdad)
    {
        this.edad = pEdad;
    }

    void rejuvenece (int pEdad)
    {
        if (this.getEdad() > pEdad)
        {
            this.setEdad(pEdad);
        }
    }
    
}
