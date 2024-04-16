package PqUd7;

public class Nadador 
{
    private String nombre;
    private String apellidos;
    private int edad;

    public Nadador(String pNombre, String pApellidos, int pEdad) 
    {
        this.nombre = pNombre;
        this.apellidos = pApellidos;
        this.edad = pEdad;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public String getApellidos() 
    {
        return apellidos;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setNombre(String pNombre) 
    {
        this.nombre = pNombre;
    }

    public void setApellidos(String pApellidos) 
    {
        this.apellidos = pApellidos;
    }

    public void setEdad(int pEdad) 
    {
        this.edad = pEdad;
    } 
    
    public static void generaCategorias(Nadador[] pNad)
    {
        int junior, mayores, senior;
        
        junior = 0;
        mayores = 0;
        senior = 0;
                
        for(int k=0; k<=pNad.length-1; k=k+1)
        {
            if((pNad[k].getEdad() >= 14) && (pNad[k].getEdad() <= 18))
            {
                junior = junior + 1;
            }
            
            if((pNad[k].getEdad() >= 19) && (pNad[k].getEdad() <= 55))
            {
                mayores = mayores + 1;
            }
            
            if(pNad[k].getEdad() > 55)
            {
                senior = senior + 1;
            }
        }
        
        System.out.println("Junior: " + junior);
        System.out.println("Mayores: " + mayores);
        System.out.println("Senior: " + senior);
    }
}
