package PqUd3;

import java.util.Scanner;


public class Ej3_15 
{

    public static void main(String[] args) 
    {
        //Primer ejemplo de switch
        Scanner teclado = new Scanner(System.in);
        
        int num;
        
        System.out.print("Valor: ");
        num = teclado.nextInt();
        
        //sw tabulador hace automatico el switch
        
                       
        switch (num)
        {
            case 1://si num==1
            {
                System.out.println("Valor es uno");
                break;
            }
            
            case 2://si num==2
            {
                System.out.println("Valor es dos");
                break;
            }
            
            case 3://si num==3
            {
                System.out.println("Valor es tres");
                break;
            }
            
            default:
            {
                System.out.println("No esta entre 1 y 3");
                break;
            }
            
        }//fin switch

        System.out.println("Fin");
        
        
    }

}
