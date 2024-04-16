package PqUd7;

public class PruTodasConOes 
{
    public static void main(String[] args) 
    {
        String[] arCadenasSinO = {"Estudiar es ", "desconfiar de la inteligencia del compañero."};
        
        if (UtilArray.esTodasConOes(arCadenasSinO)== true)
        {
            System.out.println("Todas tienen o/O");
        }
        else
        {
            System.out.println("Una no tiene o/O");
        }

        
        
        
        String[] arCadenasConO = {"Empollar es ", "desconfiar de ",
            "la inteligencia del compañero."};
        
        if (UtilArray.esTodasConOes(arCadenasConO)== true)
        {
            System.out.println("Todas tienen o/O");
        }
        else
        {
            System.out.println("Una no tiene o/O");
        }
    }
    
}
