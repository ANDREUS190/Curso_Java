package PqUd3;

import java.util.Scanner;


public class Ej3_7 
{

    public static void main(String[] args) 
    {
    Scanner teclado = new Scanner(System.in);
    
    int dia, mes, año;
    String mensaje;
    
    System.out.print("Introduce un dia: ");
    dia = teclado.nextInt();
    
    System.out.print("Introduce un mes: ");
    mes = teclado.nextInt();
    
    System.out.print("Introduce un año: ");
    año = teclado.nextInt();
    
    mensaje=" ";
    
    if ((dia<1) || (dia>31))
    {
        mensaje = mensaje +"Dia no valido.";
    }    

    
    if ((mes<1) || (mes>12))
    {
        mensaje = (mensaje + "Mes no valido") ;
    }
    
    
    if ((año<1990) || (año>2100))
    {
        mensaje = (mensaje + "Año no valido");
    }    
    
     
    
    
    if ((dia>1) && (dia<31) && (mes>1) && (mes<12) && (año>1990) && (año<2100))
    {
     System.out.println(dia+"/"+mes+"/"+año);
    
    }
    else
    {
    System.out.println(mensaje);      
    }
    
    
    
      
    
    }

}
