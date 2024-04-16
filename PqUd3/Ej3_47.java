package PqUd3;

import java.util.Scanner;


public class Ej3_47 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int dineroUsu, dinApostado, numApuestas;
        boolean apostar;
        
        dinApostado = 0;
        numApuestas = 0;
        apostar = false;
        

        do
        {
            System.out.print("Cuanto dinero desea apostar?: ");
            dineroUsu = teclado.nextInt();
        
            dinApostado = dineroUsu + dinApostado;
            numApuestas = numApuestas + 1;
            
            System.out.print("Desea apostar mas? (true / false): ");
            apostar = teclado.nextBoolean();
            
            
        }while (apostar == true);
        System.out.println("");
        System.out.printf("Has realizado apuestas %d apuestas\n",numApuestas);
        
        if (dinApostado<=10)
        {
            System.out.println("¡Vete al banco a sacar dinero. ¡Ya!");
        }
        
        if ((dinApostado>10) && (dinApostado<=29))
        {
            System.out.println("De acuerdo, pero volveremos a verte...seguro");
        }
        if (dinApostado>=30)
        {
            System.out.println("¿Quiere tomar algo?");
        }

    }

}
