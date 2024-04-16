/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd7;

/**
 *
 * @author recatala
 */
public class Ej7_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int k;
        
        String[] arrCadenas;
        int[] arrLongis;
        
        arrCadenas = new String[3]; 
        
        arrCadenas[0] = "casa";
        // ¡¡¡¡Djamos null la posición 1
        arrCadenas[2] = "";

        // NO hace falta hacer esto: arrLongis = new int[arrCadenas.length]; 
        
        arrLongis = UtilArray.getArTamCadenas(arrCadenas); //OJO: no se necesita
        //crear(new) ya que se le	puede	asignar directamente otro array
        for (k = 0; k <= arrLongis.length-1; k= k+1)
        {
            System.out.println(arrLongis[k]);
        }
        
    }
    
}
