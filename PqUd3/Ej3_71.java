package PqUd3;

import java.util.Scanner;

public class Ej3_71 
{
    
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner (System.in);
        
        int nota, notaMinima, notaMaxima, k ;
        String asignatura;
        
        asignatura = "";
        
        System.out.println("------NOTAS------");

        //Inicializamos el máximo y el mínimo al primer valor que se introduce
        notaMaxima = 0;
        notaMinima = 10;
        
        for (k = 1; k<=4; k = k+1)
        {
            switch(k)
            {
                case 1:
                {
                    asignatura = "Programación";
                    break;
                }
                case 2:
                {
                    asignatura = "Lenguaje de Marcas";
                    break;
                }
                case 3:
                {
                    asignatura = "Entornos de Desarrollo";
                    break;
                            
                }
                case 4:
                {
                    asignatura = "Inglés";
                    break;
                            
                }
                default:
                {
                    break;
                }
            }//FIN switch
            
            System.out.print("La asignatura de "+ asignatura + ": ");
            nota = teclado.nextInt();
            
            if (nota < notaMinima)
            {
                notaMinima = nota;
            }
            if (nota > notaMaxima)
            {
                notaMaxima = nota;
            }
        }  //FIn for
        
        System.out.println("");
        System.out.println("Máxima nota: " + notaMaxima);
        System.out.println("Mínima nota: " + notaMinima);
        
        if ( (notaMaxima-notaMinima) <= 2 )
        {
            System.out.println("¡Eres regular! QTC.");
        }
      
  }
}
