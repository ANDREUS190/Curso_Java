package PqUd4;

import java.util.Scanner;


public class ExplicacionReturn 
{
    int suma()
    {
        //También se puede simplificar sin hacer ningún cálculo, únicamentge devolviendo un valor
        int a, b, rdo;
        a = 2;
        b = 5;
        rdo = a + b;

        return rdo;
    }    
    
    
    
    int sumaUsuario()
    {
        Scanner teclado = new Scanner(System.in);

        int rdo, num1, num2;
        
        System.out.print("Introduce primer nº: ");
        num1 = teclado.nextInt();
        
        System.out.print("Introduce segundo nº: ");
        num2 = teclado.nextInt();
        
        rdo = (num1 +num2);
        
        return rdo;
    }
            
            
            
  
}
