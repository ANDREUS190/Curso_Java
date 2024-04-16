package PqA;

public class A2 
{
    //Acceso a protected desde CLASE DE PAQUETE
    void accedoA1()
    {
        A1 aUno;
        aUno = new A1();
        
        aUno.protegido = 1; //Aquí se comprueba el acceso a un miembro (atributo protegido) protected de una clase (A1)
        // del mismo paquete (PqA) de la clase en la que estoy(A2)
        
        aUno.visualizaProtegido();
    }
}
