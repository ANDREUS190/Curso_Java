package PqUd3;

import java.util.Scanner;


public class Ej3_11 
{

    public static void main(String[] args) 
    {
    Scanner teclado = new Scanner(System.in);
    int Num1, Num2;
    
        System.out.print("Introduce un numero: ");
        Num1 = teclado.nextInt();
        
        System.out.print("Introduce otro numero: ");
        Num2 = teclado.nextInt();
        
    if (Num1<Num2)
        {
        System.out.println("Numeros ordenados: "+Num1+", "+Num2);
        }
        else
            {
            System.out.println("Numeros ordenados: "+Num2+", "+Num1);
            }
        
    
    
    
    
    }

}
