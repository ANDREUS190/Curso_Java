package PqUd3;

import java.util.Scanner;


public class Ej3_38C 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        int eleccion, salir;
        
        eleccion = 10;
        salir = 2;
        
        while (eleccion>4)
        {
            System.out.println("1.- Tabla de sumar.");
            System.out.println("2.- Tabla de restar.");
            System.out.println("3.- Tabla de multiplicar.");
            System.out.println("4.- Tabla de dividir.");
            System.out.println("");
            System.out.println("0.-Salir");
            System.out.println("");
        
            System.out.print("Elija una opción: ");
            eleccion = teclado.nextInt();
            

            switch (eleccion)
            {
                case 1:
                {
                    int suma, sumador;

                    System.out.println("");
                    System.out.print("Introduzca un numero: ");
                    suma = teclado.nextInt();

                    sumador = 0;

                    while (sumador <=10)
                    {
                        System.out.println(suma + " + " + sumador + " = " + (suma + sumador));
                        sumador = sumador + 1;
                    }
                    eleccion = 5;
                    System.out.println("");
                    break;
                }

                case 2:
                {
                    int resta, restador;

                    System.out.println("");
                    System.out.print("Introduzca un numero: ");
                    resta = teclado.nextInt();

                    restador = 0;

                    while (restador <=10)
                    {
                        System.out.println(resta + " - " + restador + " = " + (resta - restador));
                        restador = restador + 1;
                    }
                    eleccion = 5;
                    System.out.println("");
                    break;
                }

                case 3:
                {
                    int multiplicando, multiplicador;

                    System.out.println("");
                    System.out.print("Introduzca un numero: ");
                    multiplicador = teclado.nextInt();

                    multiplicando = 0;

                    while (multiplicando <=10)
                    {
                        System.out.println(multiplicador + " * " + multiplicando + " = " 
                                + (multiplicador*multiplicando));
                        multiplicando = multiplicando + 1;
                    }
                    eleccion = 5;
                    System.out.println("");
                    break;
                }

                case 4:
                {
                    int div, dividor;

                    System.out.println("");
                    System.out.print("Introduzca un numero: ");
                    div = teclado.nextInt();

                    dividor = 1;

                    while (dividor <=10)
                    {
                        System.out.println(div + " / " + dividor + " = " + (div%dividor));
                        dividor = dividor + 1;
                    }
                    eleccion = 5;
                    System.out.println("");
                    break;
                }

                default:
                {
                    if (eleccion == 0)
                    {
                        System.out.print("¿Esta usted seguro que desea salir SI (1) | NO (0): ");
                        salir = teclado.nextInt();
                    }
                    if (salir == 0)
                    {
                        eleccion= 5;
                    }
                    break;
                }
            }

        }
        


        
        

    }

}
