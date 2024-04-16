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
public class Ordenador
{
    //ELEMENTOS DE CLASE (atributos y métodos)
    static int numOrdenadores = 0;

    static void muestraCantOrdenadores()
    {
        System.out.println("Nº total de ordenadores existentes: "
                + Ordenador.numOrdenadores);
    }

    //ATRIBUTOS
    String codigo;
    double peso;
    boolean sobremesa;

    
    //CONSTRUCTOR
    Ordenador(String pCodigo, double pPeso)
    {
        //Incrementamos el nº de ordenadores existentes
        Ordenador.numOrdenadores = Ordenador.numOrdenadores + 1;

        //Informamos atributos:
        this.codigo = pCodigo.trim(); // Quitamos espacios en blanco del codigo
        this.peso = pPeso;
	//OJO: en el constructor NO es necesario utilizar los get() de los atributos, ya que estamos contruyendo el objeto.!!!
        //Si el peso es >= 2'5
        if (this.peso >= 2.5)
        {
            this.sobremesa = true;
        }
        else // si el peso NO es >=2'5
        {
            this.sobremesa = false;
        }
        // Se podría simplificar con esta sentencia:
        // this.sobremesa  = (this.peso >= 2.5);
    }

   //MÉTODOS
   double getPeso()
   {
        return this.peso;
   }

   void muestraPeso()
   {
       System.out.printf("peso = %.1f Kg\n", this.getPeso());
   }

   void setPeso(double pPeso)
   {
        this.peso = pPeso;
   }
}
