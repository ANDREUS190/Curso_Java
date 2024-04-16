package PqUd7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ej7_32 
{   
    public static void calcula(String pNota1, String pNota2, String pNota3, String pCodigo, String pNombre) throws Exception
    {
        final int TRES = 3;
        double media;
        int[] arrayEnt;
        
        if((sonNumericos(pNota1)==true) && (sonNumericos(pNota2)==true) && (sonNumericos(pNota3)==true))
        {
            arrayEnt = new int[TRES];
            arrayEnt[0] = Integer.parseInt(pNota1);
            arrayEnt[1] = Integer.parseInt(pNota2);
            arrayEnt[2] = Integer.parseInt(pNota3);
            
            media = calcMedia(arrayEnt);
            System.out.printf("La media es %.1f\n", media);
            NotasAlumno notAlu;
            
            notAlu = new NotasAlumno(pCodigo, pNombre, TRES, media, arrayEnt);
            notAlu.visualizaDatos();       
        }
        else
        {
            throw new Exception("¡ERROR. No todas las notas son numéricas!");
        }     
    }
    
    public static boolean sonNumericos(String pCadena)
    {
        boolean todoDigitos = true;
        int k;
        
        pCadena = pCadena.trim();
        
        if(! pCadena.isEmpty())
        {
            k = 0;
            do
            {
                if(! (Character.isDigit(pCadena.charAt(k))))
                {
                    todoDigitos = false;
                }
                            
            }while( (k<=pCadena.length()-1) && (todoDigitos == true) );
            
        }
        return todoDigitos;                
    }
    
    public static double calcMedia(int[] pNotas)
    {
        int suma = 0;
        double rdo;
        for(int k=0; k<=pNotas.length-1; k=k+1)
        {
            suma = suma + pNotas[k];
        }
        
        rdo = (suma / pNotas.length);
        return rdo;
    }
    
    public static void main(String[] args) throws IOException 
    {
        Scanner teclado = new Scanner(System.in);
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String codigo, nombre;
        String setNot1, setNot2, setNot3;
        int nota1, nota2, nota3;
        
        System.out.println("--------DATOS ALUMNO--------");
        
        System.out.print("Código: ");
        codigo = stdin.readLine();
        
        System.out.print("Nombre: ");
        nombre = stdin.readLine();
        
        System.out.print("Nota 1: ");
        nota1 = teclado.nextInt();
        setNot1 = Integer.toString(nota1);
        
        System.out.print("Nota 2: ");
        nota2 = teclado.nextInt();
        setNot2 = Integer.toString(nota2);
        
        System.out.print("Nota 3: ");
        nota3 = teclado.nextInt();
        setNot3 = Integer.toString(nota3);
       
        try
        {
            calcula(setNot1, setNot2, setNot3, codigo, nombre);
        }
        catch (Exception excMia)
        {
            System.out.println("Fin del programa por: " + excMia);
        }            
    }
}
