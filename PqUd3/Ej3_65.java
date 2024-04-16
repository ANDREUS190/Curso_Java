package PqUd3;

import java.util.Scanner;

public class Ej3_65 
{
    
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner (System.in);

        final int TOPE = 5;

        int k, numero;
        
        k=0;  // Inicializo a 0 porque genero nº de la serie en el bucle para 
              //poder comparar adecuadamente en condición
        do
        {
            System.out.print("Introduzca nº de la serie: ");
            numero = teclado.nextInt();

            k = k+1; //Genero nº de la serie
        }while ( (k<TOPE) && (numero==k) ); 
        //FIN Mientras no supere el tope de la serie Y esté introduciendo de manera correcta la serie
        
        // Si salió del bucle por no introducir de manera correcta la serie
        if (numero != k)
        {
            System.out.println("");
            System.out.println("Fallaste en la introducción de la serie. La serie correcta es: ");
            //Mostramos la serie de manera correcta
            for (k=1; k<=TOPE; k= k+1)
            {
                System.out.print(k +"-");
            }
            System.out.println("");
        }// FIN Si salió del bucle por no introducir de manera correcta la serie

    }
}
