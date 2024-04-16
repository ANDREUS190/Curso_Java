package PqA;

public class A11 extends A1
{
    //accesso a protected desde subcalse de mismo paquete
    void accedoA1()
    {
        A1 aUno;
        aUno = new A1();
        
        aUno.protegido = 1;

        
        aUno.visualizaProtegido();
    }  
}
