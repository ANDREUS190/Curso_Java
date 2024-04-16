package PqUd4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ej4_22 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner teclado = new Scanner(System.in);
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        int opcion, nVeces, lado;
        char caracter;
        String linea;
        
        do
        {    
            do
            {
                System.out.println("---INTRODUCE OPCION---");
                System.out.println("1 - DIBUJA UN GUION");
                System.out.println("2 - DIBUJA LINEA ENTERA");
                System.out.println("3 - DIBUJA TU LINEA");
                System.out.println("4 - DIBUJA TU TRIANGULO");
                System.out.println("5 - SALIR\n");

                System.out.print("Introduce opcion: ");
                opcion = teclado.nextInt();
            }while ((opcion <1) || (opcion >5));

            switch (opcion)
            {
                case (1):
                {
                    UtilGraficas.dibujaGuion();
                    break;
                }
                case (2):
                {
                    UtilGraficas.dibujaLinea();
                    break;
                }
                case (3):
                {
                    System.out.print("Caracter a utilizar: ");
                    linea = stdin.readLine();
                    caracter = linea.charAt(0);

                    do
                    {
                        System.out.print("Veces a repetir el caracter: ");
                        nVeces = teclado.nextInt();
                    }while ((nVeces<1) || (nVeces>80));

                    UtilGraficas.dibujaLineaParam(caracter, nVeces);
                    break;
                }
                case (4):
                {
                    System.out.print("Caracter a utilizar: ");
                    linea = stdin.readLine();
                    caracter = linea.charAt(0);

                    System.out.print("Lado: ");
                    lado = teclado.nextInt();

                    UtilGraficas.dibujaEquilatero(caracter, lado);
                    break;
                }
                case (5):
                {
                    break;
                }
            }  
        }while(opcion !=5);
    }
}
