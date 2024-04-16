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
public class PruConstructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Tableta tab1,tab2;
        
        tab1 = new Tableta("Samsung","Tab 10",
               220, "PAB");

        tab2 = new Tableta("PK");       
               
        System.out.println(tab1.marca + ", " 
                + tab1.modelo + ", "
                            + tab1.precio);

        System.out.println(tab2.marca + ", " 
                + tab2.modelo + ", "
                            + tab2.precio);
    }
    
}
