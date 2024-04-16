package PqUd3;

import java.util.Scanner;

public class Ej3_36 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int multiplicando, multiplicador, tabla;
            
        multiplicando = 0;
        tabla = 0;
        multiplicador = 0;
        
        while (tabla<=10)
        {
            System.out.printf("---- Tabla del %d. ----",tabla);
            System.out.println("");
            
            while (multiplicando<=10)
            {
                System.out.println(multiplicador + " * " + multiplicando + " = " + multiplicador*multiplicando);
                multiplicando = multiplicando + 1;
              
            }
            multiplicador = multiplicador + 1;
            multiplicando = 0;
            tabla = tabla + 1;
            System.out.println("");
        }
        
        
        

    }

}
