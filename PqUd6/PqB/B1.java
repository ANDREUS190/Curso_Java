package PqB;

import PqA.A1;

public class B1 
{
    //no se puede acceder a portected desdee clase de otro paquete
    void accedoA1()
    {
        A1 aUno;
        aUno = new A1();
        
        //aUno.protegido = 1; //error        
       // aUno.visualizaProtegido();//error
    } 
}
