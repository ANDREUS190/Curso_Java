package PqUd4;

import java.util.Scanner;

public class Ej4_9 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        Deposito dep1, dep2;
        
        int aux;

        dep1 = new Deposito();
        dep2 = new Deposito();


        dep1.capacMax  = 250;
        dep2.capacMax  = 300;
        
        dep1.abreDeposito();
        dep2.abreDeposito();
        
        
        aux = 0;  //aux = la cantidad de litros que quiero poner
        do 
        {
            //Actualizo la cantidad a lo que queria poner(aux)
            dep1.cantidad = (dep1.getCantidad() + aux);

            System.out.print("1er depósito. Introduce cuánto quieres repostar: ");
            aux = teclado.nextInt();

        } while ((dep1.getCantidad() + aux) <= dep1.capacMax );
        
        
        System.out.println("");
        
        aux = 0;
        do 
        {
            dep2.cantidad = (dep2.getCantidad() + aux);
            
            System.out.print("2º depósito. Introduce cuánto quieres repostar: ");
            aux = teclado.nextInt();

        } while ((dep2.getCantidad() + aux) <= dep2.capacMax );
        


        System.out.printf("\nEl deposito 1 contiene: %d litros\n\nEl deposito 2 contiene: %d litros\n",
                dep1.getCantidad(), dep2.getCantidad());
    }
}
