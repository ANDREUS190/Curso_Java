/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd4;

import java.util.Scanner;

public class Maquinita 
{
    Scanner teclado = new Scanner(System.in);

    int codigo;
    int memoria;
    boolean actualizable;
    
    
    
    void setCodigo()
    {   
        System.out.print("Introduzca código: ");
        this.codigo = teclado.nextInt();
    }

    void setMemoria()
    {
        System.out.print("Introduzca memoria: ");
        this.memoria = teclado.nextInt();
    }

    void setActualizable()
    {
        System.out.print("Introduzca si es actualizable (true/false): ");
        this.actualizable = teclado.nextBoolean();
    }

    int getCodigo()
    {
        return this.codigo;
    }

    int getMemoria()
    {
        return this.memoria;
    }

    boolean getActualizable()
    {
        return this.actualizable;
    }

    void visualizaDatos()
    {
        String rdo;

        rdo = "La maquinita de código " + this.getCodigo()
                + ", con una memoria de " + this.getMemoria() + "Mb ";
        
        if (this.getActualizable() == false)
        {
            rdo = rdo + "no ";
        }    
        else
        {
            rdo = rdo + "sí ";
        }

	rdo = rdo + "es actualizable";
        
        System.out.println(rdo);
    }
    
    
    
    //4_7B-------------
    String getSerieMem()
    {
        String serie;
        int k;
        
        serie = "";
        for (k=0; k<=this.getMemoria(); k=k+6)
        {
            serie = (serie + k + "-");
        }

        return serie;
    }
      
    void incrementaMem()
    {
	/* Se podría hacer con while:
	
	*/
        int incremento;

        incremento = 0; //inicialmente a 0 para que no altere el valor de memoria
			// la primera vez que entra en el bucle
        do 
        {
            this.memoria = this.getMemoria() + incremento;
         
            System.out.print("¿Cuánta memoria deseas incrementar? ");
            incremento = teclado.nextInt();
        } while (incremento >=0);

    }
      

}
