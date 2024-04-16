package PqUd3;

import java.util.Scanner;


public class Ej3_32 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int numUsu, suma, preguntas;
        
        preguntas = 0;
        suma = 0;
        
        System.out.println("-----Primer Ejercicio-----");
        
        while (preguntas != 10)
        {
            preguntas = preguntas + 1;
            
            System.out.printf(" %dº Pon un numero entero: ",preguntas);
            numUsu = teclado.nextInt();
            System.out.println("");
            
            suma = suma + numUsu;
        }
        System.out.printf("La suma de las %d preguntas son: %d",preguntas, suma);
        System.out.println("");
        
        
        
        
        System.out.println("");
        System.out.println("-----Segundo Ejercicio-----");
        
        int preguntasUsu;
        
        System.out.print("Introduce el numero de preguntas que quieras hacer: ");
        preguntasUsu = teclado.nextInt();
        System.out.println("");
        
        suma = 0;
        preguntas = 0;
        
        while (preguntas != preguntasUsu)
        {
            preguntas = preguntas + 1;
            
            System.out.printf(" %dº Pon un numero entero: ",preguntas);
            numUsu = teclado.nextInt();
            System.out.println("");
            
            suma = suma + numUsu;
        }
        System.out.printf("La suma de las %d preguntas son: %d",preguntas, suma);
        System.out.println("");
        
                
        
        
        
        System.out.println("");
        System.out.println("-----Tercer Ejercicio-----");
        
        int resp;
        
        suma = 0;
        preguntas = 0;
        resp= 1;
        
        while (resp != 0)
        {
            preguntas = preguntas + 1;
            
            System.out.printf(" %dº Pon un numero entero: ",preguntas);
            resp = teclado.nextInt();
            System.out.println("");
            
            suma = suma + resp;
        }
        System.out.printf("La suma de las %d preguntas son: %d",preguntas, suma);
        System.out.println("");
        
        
        
        
        System.out.println("");
        System.out.println("-----Cuarto Ejercicio-----");
        
        boolean impar;
        suma = 0;
        preguntas = 0;
        impar= false;
        
        while (impar != true)
        {
            preguntas = preguntas + 1;
            
            System.out.printf(" %dº Pon un numero entero: ",preguntas);
            resp = teclado.nextInt();
            
            if ((resp%2) !=0)
            {
                impar = true;
                resp = 0;
                preguntas = preguntas - 1;
            }
            System.out.println("");
            
            suma = suma + resp;
        }
        System.out.printf("La suma de las %d preguntas son: %d",preguntas, suma);
        System.out.println("");
        
       
        
        
        
        
        

        
        
        
        


    }

}
