package PqUd3;

import java.util.Scanner;

public class Ej3_67 
{
    
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner (System.in);


        int num, numAciertos, incognita, intentos;
        int contConsecutivos; //vble que nos indicará si acertó 5 nºs consecutivos
        
        contConsecutivos = 0; 
        numAciertos = 0;
        intentos = 0; 
        do //repite_mientras no acierte 5
        {
            incognita = ((intentos+1) *3); //Generamos incógnita de manera "aleatoria"
                                           // podría ser con random
            System.out.println("El nº es : " + incognita);
            System.out.print("Intente introducir el mismo nº: ");
            num = teclado.nextInt();    
            intentos = (intentos +1);
            //Si coinciden los números
            if (num == incognita) 
            {
                numAciertos = (numAciertos +1);
                contConsecutivos = (contConsecutivos +1); //Cada vez que acierte 
                                    //incrementamos consecutivos, hasta que se 
                                    //demuestre que no sean consecutivos(el else) 
                                    //en el que lo podremos a 0
            }
            else // //Si NO coinciden los números
            {
                contConsecutivos = 0;  //Ponemos contador a 0 al romperse 
                                        //la "seguidilla" de consecutivos
                
            }
        } while(numAciertos < 5); //FIN repite_mientras no acierte 5
        
        
        // Cuando sale del bucle seguro que es porque acertó 5 y...
        System.out.println("\n5 aciertos: fin del juego.");
        //... si consecutivos es igual a 5 
        if (contConsecutivos == 5)
        {
            System.out.println("Premio: partida gratis.");
        }

        System.out.println("Nº de intentos: " + intentos + ".");


    }
}
