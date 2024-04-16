package PqUd5;

public class AparatoElectrico 
{
    //Elementos de clase
    static double consumoTotal = 0.0;
    
    static double getConsumo()
    {
        return AparatoElectrico.consumoTotal;
    }
    
    //Atributos
    double potencia;
    boolean encendido = false;
    
    //Metodos
    AparatoElectrico(double pPotencia)
    {
        pPotencia = this.potencia;
    }
    
    void enciende()
    {
        if (this.encendido == false)
        {
            this.encendido = true;
            AparatoElectrico.consumoTotal = (AparatoElectrico.getConsumo() + this.potencia);
        }
    }
    
    void apaga()
    {
        if (this.encendido == true)
        {
            this.encendido = false;
            AparatoElectrico.consumoTotal = (AparatoElectrico.getConsumo() - this.potencia);
        }
    }
}
