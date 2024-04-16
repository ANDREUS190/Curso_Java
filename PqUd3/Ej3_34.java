package PqUd3;

import java.util.Scanner;

public class Ej3_34 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        final int NOTAS = 5;
        int k;
        double nota, notamedia, notabaja;
        
        k = 0;
        notamedia = 0;
        notabaja = 10;
        
        
        while (k<NOTAS)
        {
            k = k + 1;
            System.out.printf("Introduce la %dª nota: ", k);
            nota = teclado.nextInt();
            System.out.println("");
            
            if (notabaja>nota)
            {
                notabaja = nota;
            }
                
            notamedia = notamedia + nota;
            
        }
        notamedia = notamedia / NOTAS;
        
        System.out.printf("La nota mas baja es un %.2f ",notabaja);
        System.out.println("");
        System.out.printf("La nota media es un %.2f. ",notamedia);
        System.out.println("");
        
        

    }

}
