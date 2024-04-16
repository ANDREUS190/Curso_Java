package PqUd5;

public class PruElementosClase 
{
    public static void main(String[] args) 
    {
        Concursante c1, c2, c3;
        
        Concursante.visualizaNumConcursante();
        c1 = new Concursante("Sergio", "Andreu", 1210);
        Concursante.visualizaNumConcursante();
        
        c2 = new Concursante("Alfonso", "Madrid", 1920);
        Concursante.visualizaNumConcursante();
        
        c3 = new Concursante("Adela", "Mela", 2000);
        Concursante.visualizaNumConcursante();

        
    }
}
