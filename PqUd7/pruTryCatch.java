package PqUd7;

public class pruTryCatch 
{
    public static void main(String[] args) 
    {
        int error, divdo, divsor;
        
        error = 0;
        divdo = 20;
        divsor = 0;
        
        try
        {
            error = (divdo/divsor);
        }
        catch(Exception excMia)
        {
            System.out.println("La excepcion es: " + excMia);
        }
        
        System.out.println("Fin");
    }
}
