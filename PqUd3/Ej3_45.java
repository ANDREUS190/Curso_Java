package PqUd3;

import java.util.Scanner;


public class Ej3_45 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        final int ACIERTO = (int) (Math.random()*9);

        int numUsu;
        
        do
        {
            System.out.print("Introduce un numero del 0 al 9: ");
            numUsu = teclado.nextInt();
            
            if (numUsu>ACIERTO)
            {
                System.out.println("El numero es menor");
            }
            if (numUsu<ACIERTO)
            {
                System.out.println("El numero es mayor");
            }
                    
        }while (numUsu!=ACIERTO);
        System.out.println("Acertastes el nº " + ACIERTO);
        
    }

}
