package PqUd3;

import java.util.Scanner;


public class Ej3_38D 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int inicio, numUsu;
        double contador, media;
        
        inicio = 1000;
        contador = 0;
        media = 0;
        
        System.out.print("Introduzca fin de la serie: ");
        numUsu = teclado.nextInt();
        
        while (inicio>=numUsu)
        {
            media = media + inicio;
            contador = contador + 1;
            System.out.print(inicio + " ");
            inicio = inicio - 3;
        }
        System.out.println("");
        System.out.printf("\nLa media es: " + (media/contador));
        System.out.println("");
        
        


    }

}
