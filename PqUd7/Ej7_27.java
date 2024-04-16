package PqUd7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ej7_27 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        Scanner teclado = new Scanner(System.in);
        
        Equipo equipo1;
        Jugador[] jugadores = new Jugador[5];
        int opcion, num, max;
        String equipo, ciudad;
        equipo = "";
        max = 0;
        String nombre, dorsal;
        num = 1;
        
        do
        {
            do
            {                  
                System.out.println("Menú:");
                System.out.println("1. - Dar de alta equipo.");
                System.out.println("2. - Dar de alta jugador.");
                System.out.println("3. - Imprime estadísticas.");
                System.out.println("0. - Salir.\n");

                System.out.print("Escoge tu opción: ");
                opcion = teclado.nextInt();

            }while((opcion < 0) || (opcion > 3));
      
            switch(opcion)
            {
                case 1:
                {                                
                    System.out.print("Nombre del equipo: ");
                    equipo = stdin.readLine();

                    System.out.print("Ciudad del equipo: ");
                    ciudad = stdin.readLine();

                    equipo1 = new Equipo(equipo, ciudad);
                    break;
                }

                case 2:
                {                   
                    if (max <6)
                    {
                        System.out.print("Nombre del jugador " + num + " : ");
                        nombre = stdin.readLine();

                        System.out.print("Dorsal del jugador: " + num + " : ");
                        dorsal = stdin.readLine();

                        jugadores[max] = new Jugador(nombre, dorsal);
                    }
                    max = max + 1;
                    num = num + 1;
                    break;                  
                }

                case 3:
                {
                    System.out.println("Nombre del equipo: " + equipo);
                    System.out.println("\nJugadores: ");
                    num = 1;
                    for(int k=0; k<=jugadores.length-1; k=k+1)
                    {
                        System.out.println("Nombre del " + num + " jugador: " + jugadores[k].getNombre() + " , Dorsal: " + jugadores[k].getDorsal());
                    }
                    break;
                }

                default:
                {
                    break;
                }
            }
            
            System.out.println("\n");
        }while(opcion != 0);
    }
}
