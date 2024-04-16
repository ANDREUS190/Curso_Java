package PqUd4;

public class Ej4_17 
{
    public static void main(String[] args) 
    {
        Alumno al1;
        al1 = new Alumno();
        
        al1.nombre = "Pepe Alumno";
        al1.grupo = "DAW1T";
        al1.modulo= "PRO";
        
        al1.notaEv1 = 3.0;
        al1.notaEv2 = 5.0;
        al1.notaEv3 = 7.0;
        
        al1.elite = true;
        
        al1.visualizaDatos();
        
        //Calculamos la meida 
        //para que informe media:
        al1.calculaMedia();
        
        al1.incrementaNota();
        al1.visualizaDatos();
    }
}
