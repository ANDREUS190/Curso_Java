package PqUd4;

public class Ej4_10 
{
    public static void main(String[] args) 
    {
        //Este ejercicio habría que dejarlo
        //utilizando una sola variable aux.
        //si tenéis dudas hablad con Kevin o con Juan y con Sergio...
        
        Alumno al1, al2;

        al1 = new Alumno();
        al2 = new Alumno();
        
        double aux1,aux2,aux3; //Vbles auxiliares,intermedias para guardar temporalmente las notas

        al1.notaEv1 = 1.0;
        al1.notaEv2 = 1.1;
        al1.notaEv3 = 11.1;

        al2.notaEv1 = 2.0;
        al2.notaEv2 = 2.2;
        al2.notaEv3 = 22.2;

        System.out.println("Las notas del alumno 1 son: " + al1.getCadNotasAlumno());
        System.out.println("Las notas del alumno 2 son: " + al2.getCadNotasAlumno());

        System.out.println("\nIntercambiamos.........\n");
//Se podría hacer con una sola vble. Aux!!!!!
        //Guardo en vbles. intermedias los valores de las notas de al2 pq sino se machacarían al volcarle lo de al1
        aux1 = al2.getNotaEv1();
        aux2 = al2.getNotaEv2();
        aux3 = al2.getNotaEv3();
        
        //Copio las de al1 en al2
        al2.notaEv1 = al1.getNotaEv1();
        al2.notaEv2 = al1.getNotaEv2();
        al2.notaEv3 = al1.getNotaEv3();
        
        //Volcamos notas guardadas(de al2) en al1
        al1.notaEv1 = aux1;
        al1.notaEv2 = aux2;
        al1.notaEv3 = aux3;

        System.out.println("Las notas del alumno 1 son: " + al1.getCadNotasAlumno());
        System.out.println("Las notas del alumno 2 son: " + al2.getCadNotasAlumno());
    }
}
