package PqUd3;

import java.util.Scanner;


public class Ej3_56 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        final int ALUMNOS = 10;
        int k;
        
        double nota, media, baja, alta;
        
        baja = 10;
        alta = 0;
        media = 0;
        
        for (k=1; k<=ALUMNOS; k=k+1)
        {
            System.out.printf("Introduce la nota del %dº alumno: ",k);
            nota = teclado.nextDouble();
            System.out.println("");
            
            media = media + nota;
            
            if (nota<=baja)
            {
                baja = nota;
            }
            
            if (nota>=alta)
            {
                alta = nota;
            }
            
        }
        media = media/ALUMNOS;
        
        System.out.println("");
        System.out.println("La nota mas baja es = " + baja);
        System.out.println("La nota mas alta es = " + alta);
        System.out.println("La nota media es = " + media);
        
        

    }

}
