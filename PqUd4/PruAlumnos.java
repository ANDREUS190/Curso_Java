/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd4;

/**
 *
 * @author andreu
 */
public class PruAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno al1, al2;
        
        al1 = new Alumno();
        al2 = new Alumno();
        
        
        al1.grupo = "D1";
        al2.grupo = "D2";
        
        System.out.println(al1.getGrupo());
        System.out.println(al2.getGrupo());
        
        al1.setGrupo("DAW8");

        System.out.println(al1.getGrupo());
        System.out.println(al2.getGrupo());
    }
    
}
