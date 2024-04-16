package PqUd7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UtilArray 
{
    public static void modificaArray(int[] pArrEnt)
    {
        pArrEnt[0] = 88;
        pArrEnt[3] = 77;
    }
    
    public static void mostrarArrayPantalla(int[] pArrEnt)
    {
        for(int k : pArrEnt)  
        {
           System.out.println(k);
        }
    }
    
    public static void mostrarArrayPantallaComas(int[] pArrEnt)
    {
        for (int k=0; k<= pArrEnt.length-2; k=k+1)
        {
            System.out.print(pArrEnt[k] + ",");
        }
        System.out.println(pArrEnt[pArrEnt.length-1]);
    }
    
    public static String obtenerArrayComoString(int[] pArrEnt)
    {
        String rdo = "";
        for (int k : pArrEnt)
        {
            rdo = rdo + k;
        }
   
        return rdo;
    }
    
    public static void completaArrayIndice(int[] pArrEnt)
    { 
        for (int k=0; k<=pArrEnt.length-1; k=k+1)
        {
            pArrEnt[k] = k;
        }
    }
    
    public static void completaArrayValor(int[] pArrEnt, int posicion)
    {
        for (int k=0; k<=pArrEnt.length-1; k=k+1)
        {
            pArrEnt[k] = posicion;
        }
    }
    
    public static void completaArrayPares(int[] pArrEnt)
    {
        int par = 2;
        for (int k=0; k<=pArrEnt.length-1; k=k+1)
        {
            pArrEnt[k] = par;
            par = par + 2;
        }
    }
    
    public static int getArraySuma(int[] pArrEnt)
    {
        int suma = 0;
        for (int k=0; k<=pArrEnt.length-1; k=k+1)
        {
            pArrEnt[k] = k;
            suma = suma + k;
        }
        
        return suma;
    }
    
    public static int[] getArrayMultiplicado(int[] pArrEnt, int mult)
    {
        int[] rdo;
        int cont = 0;
        
        rdo = new int[pArrEnt.length];
        
        for(int k=0; k<=pArrEnt.length-1; k=k+1)
        {
            rdo[k] = pArrEnt[k] * mult;
        }
        return rdo;
    }
    
    static public int obtenerSumaLongCadArray(String[] pArrCad)
    {
        int suma; int k;

        suma = 0;

        //Recorremos el array DE CADENAS
        for (k = 0; k <= pArrCad.length-1; k= k+1)
        {
            if (pArrCad[k] != null) //Si existe= Si no es nulo
            {
                suma = suma + pArrCad[k].length();
            }
        }
        
        return suma;
    }
    
    public static int[] getArTamCadenas(String[] pArrCad)
    {
        int k;

        int[] arrLongs;
        arrLongs = new int[pArrCad.length];

        //Recorremos el array DE CADENAS
        for (k = 0; k <= pArrCad.length-1; k= k+1)
        {
            if (pArrCad[k] != null) //Si la cadena existe (no es nula)
            {
                arrLongs[k] = pArrCad[k].length();
            }
                    
            // NO ponemos el else porque cuando se crea el array de enteros queda
            //inicializado a 0’s
        }
        return arrLongs;
    }
    
    public static void equilibraArray(int[] pArrEnt)
    {
        int suma, media;
        suma = 0;
        media = 0;
        
        for (int k=0; k<=pArrEnt.length-1; k=k+1)
        {
            suma = suma + pArrEnt[k];
        }
        
        if(pArrEnt.length!=0)
        {
            media = suma/pArrEnt.length;
        }
        UtilArray.completaArrayValor(pArrEnt, media);
    }
    
    public static boolean esTodasConOes(String[] pArrCad)
    {
        boolean rdo = true;
        int suma = 0;

        do
        {                                   
            if (pArrCad[suma].toUpperCase().contains("O") ==false)
            {
                rdo = false;
            }
            
            suma = suma + 1;
        }while((rdo ==true) && (suma<=pArrCad.length-1));

        return rdo;
    }
    
    public static char[] convCadArray(String pCad)
    {
        char[] arrCad;
        
        arrCad = new char[pCad.length()];
        
        for(int k=0; k<=pCad.length()-1; k=k+1)
        {
            arrCad[k] = pCad.charAt(k);
        }

        return arrCad;
    }
    
    public static void rellenaMatrizSecuencia(int[][] pTabEnt)
    {
        int num = 0;
        int m; //columnas tabla.length
        int k; //filas tabña[0].length
        for(m=0; m<=pTabEnt.length-1; m=m+1)
        {
            for(k=0; k<=pTabEnt[0].length-1; k=k+1)
            {
                pTabEnt[m][k]= num;
                num = num + 1;
            }
        }
    }
    
    public static String arrMultiToString(int[][] pTabEnt)
    {
        String rdo = "";
        int num = 0;        
        int fila; //columnas tabla.length
        int col; //filas tabña[0].length
        
        for(fila=0; fila<=pTabEnt.length-1; fila=fila+1)
        {
            for(col=0; col<=pTabEnt[0].length-1; col=col+1)
            {
                rdo = rdo + "\t" + pTabEnt[fila][col];
                num = num + 1;
            }    
            rdo = rdo + "\n";
        }        
        return rdo;
    }
    
    public static String[] rellenaArray() throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        int numCadena;
        String[] cadena = new String[4];
        
        for(int k=0; k<=cadena.length-1; k=k+1)
        {
            System.out.print("Introduce cadena de caracteres: ");
            cadena[k] = stdin.readLine().trim();
        }  
        
        return cadena;
    }
}
