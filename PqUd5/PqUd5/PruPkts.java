package PqUd5;

import PqInstituto.Alumno;
import static java.lang.Math.*;

public class PruPkts 
{
    public static void main(String[] args) 
    {
        Alumno al1;
        al1 = new Alumno();
        
        al1.nombre = "Sergio";
        System.out.println("El nombre es " + al1.nombre);      
        
        al1.edad = 19;
        System.out.println(al1.edad);
        
        System.out.println(pow(2,3));
        System.out.println(sqrt(4));
        
    }
}
