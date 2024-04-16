package PqUd7;

public class Escrito 
{
    private String[] contenido;
    private boolean todoOes;
    
    public Escrito(String[] pContenido) throws Exception
    {
        for (int k=0; k<=pContenido.length-1; k=k+1)
        {
            if(pContenido[k] == null)
            {                
                throw new Exception("¡Hay cadena nulas!");
            }
        }
        
        this.contenido = pContenido;
        
        if (UtilArray.esTodasConOes(pContenido) == true)
        {
            this.todoOes = true;
        }
        else
        {
            this.todoOes = false;
        }
    }
    
    public String[] getContenido()
    {
        return this.contenido;
    }
    
    public boolean getTodoOes()
    {
        return this.todoOes;
    }

    public void visulizaDatos()
    {
        for(int k=0; k<=getContenido().length-1; k=k+1)
        {
            System.out.print(this.getContenido()[k] + "***");
        }
        System.out.println("\b\b\b");
       
    }
}
