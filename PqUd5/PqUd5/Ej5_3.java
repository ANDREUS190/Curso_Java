package PqUd5;

public class Ej5_3 
{
    public static void main(String[] args) 
    {
        AparatoElectrico escaner, radiador, aspiradora;
        escaner = new AparatoElectrico(100.00);
        radiador = new AparatoElectrico(2000.00);
        aspiradora = new AparatoElectrico(1200.00);
        
        System.out.println("El consumo electrico es = " + AparatoElectrico.getConsumo());
        
        escaner.enciende();
        aspiradora.enciende();
        System.out.println("El consumo electrico es = " + AparatoElectrico.getConsumo());
        
        aspiradora.apaga();
        radiador.enciende();
        System.out.println("El consumo electrico es = " + AparatoElectrico.getConsumo());
        
        
        
    }
}
