package PqUd3;

import java.util.Scanner;


public class Ej3_11A 
{

    public static void main(String[] args) 
    {
    Scanner teclado = new Scanner(System.in);
    
    int Num1, Num2, menor, mayor;
    
        System.out.print("Introduce un numero: ");
        Num1 = teclado.nextInt();
        
        System.out.print("Introduce otro numero: ");
        Num2 = teclado.nextInt();
        
    if (Num1<Num2)
        {
        menor=Num1;
        mayor=Num2;
        
        }
        else
            {
            menor=Num2;
            mayor=Num1;
            }
        
        System.out.println("Numeros ordenados: "+menor+", "+mayor);

    }

}
