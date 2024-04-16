/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd5;

/**
 *
 * @author recatala
 */
public class Ej5_13H {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        double media;

        media = Utilidad.mediaReal(12, 10, 17);
        System.out.printf("La media es %.1f.\n" , media);

        media = Utilidad.mediaReal(10, 5);
        System.out.printf("La media es %.1f.\n" , media);

        media = Utilidad.mediaReal();
        System.out.printf("La media es %.1f.\n" , media);

    }
    
}
