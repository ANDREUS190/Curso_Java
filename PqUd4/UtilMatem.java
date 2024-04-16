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
public class UtilMatem 
{
    public static double mediaAritmetica(double ... pListaReales)
    {
        double suma, media;
        
        suma = 0.0;
        media = 0.0;

        //si hay elementos en la lista controlamos que no divida por cero
        if (pListaReales.length != 0)
        {
            for (double num : pListaReales) 
            {
                suma = (suma + num);             
            }
        }
        else
        {
            //Lanzariamos una excepción
            System.out.println("No hay parametros");
        }
        
        media = (suma/pListaReales.length);
        
        return media;
    }
    
    
    public static int sumaTotal(int ... pLista)
    {
        int suma, k;
        //suma guardara la suma de todos los parametros de pLista
        
        System.out.println(pLista.length);//Length = cantidad de elementos de la lista
        
        suma = 0;
        
        //Recorrido como un array
        System.out.println("Mostramos los elementos...");
        for (k=0; k<=pLista.length-1; k= k+1)
        {
            System.out.println(pLista[k]);
        }
        System.out.println("fin");
        
        
        //recorremos la lista
        for(int num : pLista)
        {
            suma = suma + num;
        }
        return suma;
    }
    
    static void visuSumaSerie(int pNum1,int pNum2)
    {
        int menor, mayor, suma,k;
        suma = 0;
 
       //Calculo el menor y el mayor de los 2 parámetros
        menor = pNum2;
        mayor = pNum1;
        if (pNum1<pNum2)
        {
            menor = pNum1;
            mayor = pNum2;
        }

        //Visualizo la serie
        System.out.print("La serie es: ");
        for (k=menor; k<=mayor; k=k+1)
        {
            System.out.print(k +" ");
            suma = (suma +k);
        }
        System.out.print(". ");
        System.out.println("Y la suma es: " + suma);
    }
    
    
    
    double calcMedia(int pNum1, int pNum2, int pNum3)
    {
        double rdo;

        rdo = ((pNum1+ pNum2+ pNum3) / 3.0);  // Si dividimos por 3 (entero) me devolverá nº sin decimales
        
        return rdo;
    }

    
    int potencia(int pBase, int pExp)
    {
	//Multiplicaremos la base tantas veces como diga el exponente:
      //(1* pBase * pBase *.....* pBase)
        int rdo,k;

        rdo = 1;

        for (k=1; k<= pExp; k=k+1)
        {
            rdo = (rdo * pBase);
        }

        return rdo;
    }
}
