package PqUd3;

import java.util.Scanner;


public class Ej3_30 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        final int RESULTADO = 56;
        int num;
     
        System.out.print("Introduce el numero para adivinar del (0-99): ");    
        num = teclado.nextInt();
        
        while (num!=RESULTADO)
        {
            if(num>RESULTADO)
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
