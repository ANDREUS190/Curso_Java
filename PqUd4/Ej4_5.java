package PqUd4;



public class Ej4_5 {


    public static void main(String[] args) 
    {
        Alumno al1;
        
        al1 = new Alumno();
        
        al1.nombre = "Ernesto";
        al1.apellidos = "Mate Ensalsa";

        al1.notaEv1 = 5.1;
        al1.notaEv2 = 7.2;
        al1.notaEv3 = 8.3;
        
        System.out.println("Las notas son: " +
                al1.getNotaEv1() + ", "+ 
                al1.getNotaEv2() + ", " +
                al1.getNotaEv3());

        System.out.println(al1.getCadNotasAlumno());
        
        al1.visualizaMedia();

    }

}
