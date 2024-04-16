package PqUd3;

import java.util.Scanner;

public class Ej3_19 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int mes, dias;
        
        dias = 0;
        
        System.out.print("Introduzca el mes: ");
        mes = teclado.nextInt();
        
        switch (mes)
        {
            
            case (2):
            {
                dias = (28);
                break;
            }
            
            case (4): case (6): case (9): case (11):
            {
                dias = (30);
                break;
            }
            
            default:
            {
                dias = (31);
                break;
            }
            
        }
        
        System.out.println("El mes " + mes + " tiene " + dias + " dias.");
            

    }

}
