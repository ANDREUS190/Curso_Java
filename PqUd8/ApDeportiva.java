/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd8;

/**
 *
 * @author p
 */
public class ApDeportiva extends Apuesta
{
    //ATRIBUTOS
    private String equipo;

    //CONSTRUCTOR
    public ApDeportiva(int pImporte, int pPremio,  String pEquipo)
    {
        super (pImporte, pPremio);
        this.equipo = pEquipo;
    }

    public void setEquipo(String pEquipo)
    {
        this.equipo = pEquipo;
    }

    public String getEquipo()
    {
        return this.equipo;
    }

    @Override
    public void muestraDatos()
    {
        super.muestraDatos();
        System.out.println("Equipo: " + this.getEquipo());
    }

}
