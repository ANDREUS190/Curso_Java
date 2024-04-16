package PqUd7;

public class Ej7_36A 
{
    public static void main(String[] args) 
    {
        
        Mueble mue1, mue2, mue3;
        
        mue1 = new Mueble("01", "Es negr    o   ");
        mue2 = new Mueble("02", "Es marron");
        mue3 = new Mueble("03", "Es verde");
       
        Mueble[] arrMueble = {mue1, mue2, mue3}
                ;
        for(int k=0; k<=arrMueble.length-1; k=k+1)
        {
            arrMueble[k].muestraDatos();
            System.out.println("");
        }
        
        System.out.println(mue1.cuentaBlancos());
    }
}
