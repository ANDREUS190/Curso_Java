package PqUd5;

public class Concursante 
{
    //Elementos de clase
    static final int MAY_EDAD = 18;
    static int numConcursantes = 0;
    
    static int getNumConcursante()
    {
        return Concursante.numConcursantes;
    }
    
    static void visualizaNumConcursante()
    {
        System.out.println("Nº Concursante = " + Concursante.getNumConcursante());

    }
            
    //Atributos
    String nombre;
    String apellidos;
    int anyoNacim;
    
    //Constructor
    public Concursante(String pNombre, String pApellidos, int pAnyoNacim) 
    {
        Concursante.numConcursantes = Concursante.numConcursantes + 1;
        
        this.nombre = pNombre;
        this.apellidos = pApellidos;
        this.anyoNacim = pAnyoNacim;
    }
    
    //Metodos
    void setNombre (String pNombre)
    {
        this.nombre = pNombre;
    }
}
