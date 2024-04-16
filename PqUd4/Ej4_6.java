package PqUd4;

public class Ej4_6 
{
    public static void main(String[] args) 
    {
        
        Alumno al1;
        
        al1 = new Alumno();
        
        al1.nombre = "Ernesto";
        al1.apellidos = "Mate Ensalsa";

        al1.notaEv1 = 5.1;
        al1.notaEv2 = 7.2;
        al1.notaEv3 = 8.3;
        
        System.out.println( al1.getCadNotasAlumno());

        //Calculamos la media del alumno
        al1.calculaMedia(); //Este método guarda la media en el atributo media del alumno
        
        System.out.println("La media es: "+ al1.media);
        System.out.println("La nota máxima es: "+ al1.calculaMax());
        System.out.println("La nota mínima es: "+ al1.calculaMin());
    }
}
