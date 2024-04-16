package PqUd7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ej7_29 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        Scanner teclado = new Scanner (System.in);
 
        String frase, cad;
        int num, k;
        char [] arrFrase;
        
        cad = "";
        
        System.out.println("Introduzca frase: ");
        frase = stdin.readLine();
        System.out.print("Introduzca nº: ");
        num = teclado.nextInt();

        //Volcamos array resultante de cortaFrase en arrFrase
        arrFrase = Utilidades.cortaFrase(frase, num);
        
        for (k=0; k<=arrFrase.length-1; k=k+1)
        {
            //Vamos montando cadena cad con todos los caracteres del array arrFrase
            cad = cad + arrFrase[k];
        }
        //Se muestra contenido del array montado en una cadena
        System.out.println("");
        System.out.println(cad);
        
                
        //Construimos troz1 con la cadena troceada(cad), la cantidad de 
        //caracteres extraidos(num) y la frase original(frase)
        Trozo troz1 = new Trozo(cad, frase, num);
        
        System.out.println("");
    }
}
