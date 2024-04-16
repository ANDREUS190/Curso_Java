package PqUd3;

import java.util.Scanner;


public class Ej3_31 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int resultado, num, intentos;
        
        intentos = 1;
        
        resultado = (int)(Math.random()*100);
     
        System.out.print("Introduce el numero para adivinar del (0-99): ");    
        num = teclado.nextInt();
        
        while (num!=resultado)
        {
            if(num>resultado)
            {
                System.out.println("El numero es menor");
                intentos = intentos + 1;

            }
            else
            {
                System.out.println("El numero es mayor");
                intentos = intentos + 1;
         
            }
            
            System.out.print("Introduce el numero para adivinar del (0-99): ");    
            num = teclado.nextInt();
            System.out.println("");
            

        }
        
        
        System.out.println("HAS ACERTADO!!!");
        
        System.out.printf("Has utilizado %d intentos",intentos);
        System.out.println("");

    }

}
