package PqUd3;


public class Ej3_30B 
{

    public static void main(String[] args) 
    {
        int num;
        
        boolean haSalidoCero, haSalidoNoventaNueve;
        
        haSalidoCero = false;
        haSalidoNoventaNueve = false;
        

        while (! ((haSalidoCero == true) && (haSalidoNoventaNueve == true))) 
        {
            
            num = (int)(Math.random() *100);
            System.out.print(num + "--");
            
            if(num==0)
            {
                haSalidoCero = true;
            }
            
            if(num==99)
            {
                haSalidoNoventaNueve = true;
            }
        }
        


    }

}
