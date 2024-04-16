package PqUd3;

import java.util.Scanner;


public class Ej3_30A 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int resultado;
        int num;
        
        resultado = (int)(Math.random()*100);
     
        System.out.print("Introduce el numero para adivinar del (0-99): ");    
        num = teclado.nextInt();
        
        while (num!=resultado)
        {
            if(num>resultado)
            {
                System.out.println("El numero es menor");
            }
            else
            {
                System.out.println("El numero es mayor");
            }
            
            System.out.print("Introduce el numero para adivinar del (0-99): ");    
            num = teclado.nextInt();
        }
        System.out.println("HAS ACERTADO!!!");
    }
}
