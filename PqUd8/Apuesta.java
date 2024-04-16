/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd8;

/**
 *
 * @author p
 */
public class Apuesta {
    //ATRIBUTOS
    protected int importe;
    protected int premio;

    //CONSTRUCTOR
    public Apuesta (int pImporte, int pPremio)
    {
        this.importe = pImporte;
        this.premio  = pPremio;
    }

    public void setImporte(int pImporte)
    {
        this.importe = pImporte;
    }

    public void setPremio(int pPremio)
    {
        this.premio = pPremio;

    }

    public int getImporte()
    {
        return this.importe;
    }

    public int getPremio()
    {
        return this.premio;
    }


    public void muestraDatos()
    {
            System.out.println("Importe: " + this.getImporte() +
                    " Premio: " + this.getPremio() + "\n");
    }


}
