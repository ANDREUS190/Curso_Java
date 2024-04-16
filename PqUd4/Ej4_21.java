/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd4;

/**
 *
 * @author recatala
 */
public class Ej4_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception 
    {
        Asignatura asig1 , asig2;
        
        asig1 = new Asignatura ("Inglés", "1019", 2);

        System.out.println("Asignatura " + asig1.getNombre() + 
                " con código " + asig1.getCodigo() +
                " del curso " + asig1.getCurso());

        asig2 = new Asignatura ("Castellano", "1088", 8);

        System.out.println("Asignatura " + asig2.getNombre() + "con código " + asig2.getCodigo() +
                " del curso " + asig2.getCurso());

    }
    
}
