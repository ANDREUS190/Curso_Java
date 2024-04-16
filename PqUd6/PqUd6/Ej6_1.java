package PqUd6;

public class Ej6_1 
{
    public static void main(String[] args) 
    {
        Companyero compa;
        compa = new Companyero("Hugo", 23, "A110", "964123456", "Sanchez");
        
        compa.imprime();
        
        System.out.println("Nombre del compañero: " + compa.getNombre());
        System.out.println("Edad del compañero: " + compa.getEdad());
        System.out.println("Aula del compañero: " + compa.getAula());
        System.out.println("Telefono del compañero: " + compa.getTelefono());

    } 
}
