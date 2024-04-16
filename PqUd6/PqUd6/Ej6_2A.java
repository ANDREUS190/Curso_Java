package PqUd6;

public class Ej6_2A 
{
    public static void main(String[] args) 
    {
        Trabajador trab1;
        trab1 = new Trabajador("Juan", "123456789");
        
        Administrativo ad1;
        ad1 = new Administrativo("Jose", "987654321", 30000.0);
        
        Consultor co1;
        co1 = new Consultor("Juan", "123456789", 10, 50.0);
        
        System.out.println(trab1.esIgual(co1, trab1));
        
        System.out.println("La paga de administrativo es: " + ad1.calculaPaga());
        System.out.println("La paga de consultor es: " + co1.calculaPaga());      
    }
}
