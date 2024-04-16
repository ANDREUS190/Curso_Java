/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd5;

/**
 *
 * @author recatala
 */
public class UtilString
{
    public static void conteo(String pCad)
    {
        int k, contadorLetras, contadorDigitos, contadorEspacios;
        char car;
        
        contadorLetras = 0;
        contadorDigitos = 0;
        contadorEspacios = 0;
 
        for (k = 0; k <= pCad.length()-1; k=k+1) 
        {
            car = pCad.charAt(k);
            
            //Si es letra
            if (Character.isLetter(car) == true)
            {
                contadorLetras = contadorLetras+1;
            }

            //Si es dígito
            if (Character.isDigit(car) == true) 
            {
                contadorDigitos = contadorDigitos +1;
            }

             //Si es espacio
            if (Character.isWhitespace(car) == true) 
            {
                contadorEspacios = contadorEspacios+1;
            }
        } // fin recorrido String pCad

        System.out.println("Nº de letras: " + contadorLetras);
        System.out.println("Nº de dígitos: " + contadorDigitos);
        System.out.println("Nº de espacios en blanco: " + contadorEspacios);        
    } // Fin conteo()
       
    public static String concatTriCad(String pCad1, String pCad2, String pCad3)
    {
        String cadRdo, cad1, cad2, cad3;
        
        cad1 = pCad1.substring(0, 2); //2 primeras caracteres de la primera cadena
        cad2 = pCad2.substring(0, 4); //4 primeras caracteres de la segunda cadena
        cad3 = pCad3.substring(0, 6); //6 primeras caracteres de la primera cadena
        
        cadRdo = cad1+ " " + cad2 + "-" + cad3;
        
        return cadRdo;
    }
    
    public static String sustituye(String pCad)
    {
        String rdo;

        rdo = pCad;
        
        rdo = rdo.replace('a', 'e');
        rdo = rdo.replace('i', 'e');
        rdo = rdo.replace('o', 'e');
        rdo = rdo.replace('u', 'e');

        return rdo;
    }
    
    public static String cambiaPro(String pCad)
    {
        String rdo;
        rdo = pCad;
        rdo = rdo.replaceAll("pro", "anti");
        
        return rdo;
    }
  
    public static Boolean esConson(char pCar)
    {
        Boolean rdo;
        char car;
        car = Character.toUpperCase(pCar);
        
        if ((car == 'A') || (car == 'E') || (car == 'I') || (car == 'O') || (car == 'U'))
        {
            rdo = true;
        }
        else
        {
            rdo = false;
        }
        
        return rdo;
    }    
    
    
    public static int cuentaConson(String pCad)
    {
        int rdo;
        String cad;
        char car;
        
        rdo = 0;
        cad = pCad.toUpperCase();
        
        for (int k = 0; k <= cad.length()-1; k=k+1) 
        {
            car = cad.charAt(k);
            
            if(Character.isLetter(car))
            {                      
                if (esConson(car))
                {
                    rdo = rdo + 1;
                }
            }
        }
        return rdo;
    }
    
    public static String concatena(String pCad1, String pCad2)
    {
        String cadRdo, cadMenor, cadMayor;
        cadRdo = "";
        cadMenor = pCad1;
        cadMayor = pCad2;
        
        if (pCad2.length() < pCad1.length())
        {
            cadMenor = pCad2;
            cadMayor = pCad1;
        }
        
        cadRdo = cadMenor + cadMayor.substring(cadMenor.length());
        return cadRdo;
    }
    
    public static boolean encuentraCar(String pCad, char pChar) throws Exception
    {
        boolean resultado = false;
        int k;
        k = 0;
        
        if (pCad.equals(""))
        {
            throw new Exception ("La cadena esta vacia");
        }
            
        do
        {
            if (pCad.charAt(k) == pChar)
            {
                resultado = true;
            }
            k = k+1;
        }while( (resultado == false) && (k<= (pCad.length()-1)) );
        
        return resultado;
    }
    
    public static int buscaCad(String pCadena, String pPalabra)
    {
        int veces, pos;        
        veces = 0;
        
        pos = pCadena.indexOf(pPalabra,0);
        //Mientras la encuentre
        
        while(pos != -1)
        {
            veces = (veces + 1);
            //Buscamos a partir de la posicion donde lo encontro
            pos = pCadena.indexOf(pPalabra, (pos +1));
        }
        return veces;
    }
    
    public static boolean todoDigitos(String pCadena)
    {
        boolean valido = true;
        String cadena;
        cadena = pCadena.trim();
        int k = 0;
        
        while ( (k<=cadena.length()-1) && (valido == true) )
        {
            if(Character.isDigit (cadena.charAt(k)) == false)
            {
                valido = false;
            }
            k = k + 1;
        }
        
        return valido;
    }
    
    public static boolean compruebaNIFBis(String dni)
    {
        boolean valido;
        int k, suma, num;
        String error = "";
        valido = true;
        suma = 0;
        
        if (dni.length() != 9)
        {
            error= "\nEl DNI no tiene 9 digitos!!!";
            valido = false;
        }

        if (valido == true)
        {
            if (Character.isLetter(dni.charAt(8)) == false)
            {
                error = "\nEl DNI tiene que tener una letra al final";
                valido = false;
            }
        }
        
        if (valido == true)
        {
            k = 0;
            do
            {
                if(UtilString.todoDigitos(dni) == false)
                {
                    error = "\nEl DNI tiene que tener 8 numeros";
                    valido = false;
                }
                k = k + 1;
            }while ( (k<=dni.length()-2) && (valido == true) );
        }
        
        
        if(valido== true) 
        {
            for(k=0; k<=7; k = k+1)
            {
                num = Character.getNumericValue(dni.charAt(k));
                suma = (suma + num);
            }
            
            System.out.println("\nLa suma de los 8 primeros caracteres es: " + suma);
        }
        else
        {
	      System.out.println("\nERROR: " + error);
	}
        
        return valido;
    }
    
    public static boolean compruebaNIF(String dni)
    {
        boolean valido;
        int k, suma, num;
        String error = "";
        valido = true;
        suma = 0;
        
        if (dni.length() != 9)
        {
            error= "\nEl DNI no tiene 9 digitos!!!";
            valido = false;
        }

        if (valido == true)
        {
            if (Character.isLetter(dni.charAt(8)) == false)
            {
                error = "\nEl DNI tiene que tener una letra al final";
                valido = false;
            }
        }
        
        if (valido == true)
        {
            k = 0;
            do
            {
                if(Character.isDigit (dni.charAt(k)) == false)
                {
                    error = "\nEl DNI tiene que tener 8 numeros";
                    valido = false;
                }
                k = k + 1;
            }while ( (k<=dni.length()-2) && (valido == true) );
        }
        
        
        if(valido== true) 
        {
            for(k=0; k<=7; k = k+1)
            {
                num = Character.getNumericValue(dni.charAt(k));
                suma = (suma + num);
            }
            
            System.out.println("\nLa suma de los 8 primeros caracteres es: " + suma);
        }
        else
        {
	      System.out.println("\nERROR: " + error);
	}
        
        return valido;
    }
    
    public static String eliminaBlancos(String pCadena)
    {
        String rdo;
        rdo = "";
        char car;
        
        for (int k = 0; k <= pCadena.length()-1; k=k+1) 
        {
            car = pCadena.charAt(k);
            
            if (Character.isWhitespace(car) == false)
            {
                rdo = rdo + car;
            }
        }
        return rdo;
    }
    
    public static String cambiaCaracter(String pCadena, char pCar)
    {
        final char GUION = '_';
        String rdo;
        rdo = "";
        char car;
        
        for (int k = 0; k <= pCadena.length()-1; k=k+1) 
        {
            car = pCadena.charAt(k);
            
            if (car != pCar)
            {
                rdo = rdo + car;
            }
            else
            {
                rdo = rdo + GUION;
            }
        }
        return rdo; 
    }
}
