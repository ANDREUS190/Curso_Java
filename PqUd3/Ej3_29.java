package PqUd3;

import java.util.Scanner;


public class Ej3_29 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int num, resto;
        String binario;
        binario = "";
        
        System.out.print("Escribe el numero positivo que quieres pasar a binario: ");
        num = teclado.nextInt();
        
        while (num>=2)
        {
            resto = (num%2);
            binario = (resto + binario);
            num = (num / 2);
                    
        }
        binario = (num + binario);
        
        System.out.println("El numero binario es: " + binario);
        
    }

}
