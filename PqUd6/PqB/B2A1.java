package PqB;

import PqA.A1;

public class B2A1 extends A1
{
    //no se puede acceder a protected desde subclase de otro paquete
    void accedoA1()
    {
        A1 aUno;
        aUno = new A1();
        
        // aUno.protegido = 1;//error        
        //aUno.visualizaProtegido();//error
                
        //con super si que deja.
        super.protegido = 1; 
        
        super.visualizaProtegido();
    } 
}
//En general al generar un clase todos los atributos los declararemos private y los metodos public si creamos una súbelase de aquella clase, los atributos de la super clase pasan a ser protected.