/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd2;

/**
 *
 * @author daw14
 */
public class Ej2_3D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-------TABLA DE LA VERDAD-------");
        System.out.println("");
        System.out.println("Tabla del &&(Y lógico):");
        System.out.println("V&&V: " + (true && true));
        System.out.println("V&&F: " + (true && false));
        System.out.println("F&&V: " + (false && true));
        System.out.println("F&&F: " + (false && false));
        System.out.println("");
        System.out.println("Tabla del ||(O lógico)");
        System.out.println("V||V: " + (true || true));
        System.out.println("V||F: " + (true || false));
        System.out.println("F||V: " + (false || true));
        System.out.println("F||F: " + (false || false));
        System.out.println("");
        System.out.println("Tabla del !(NO lógico)");
        System.out.println("!V: " + (!true));
        System.out.println("!V: " + (!false));

    }

}
