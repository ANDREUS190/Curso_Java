package PqUd5;

public class PruExpReg 
{
    public static void main(String[] args) 
    {
        String cad;
        cad = "Mi moto alpino derrapante";
        
        System.out.println(cad.replaceAll( "[a|i|o|u]" , "e" ));    
    }
}
