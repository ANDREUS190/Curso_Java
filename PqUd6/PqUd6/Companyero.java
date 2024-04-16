package PqUd6;

public class Companyero extends Persona
{
    private String aula;
    private String telefono;
    private String apodo;

    public Companyero (String pNombre, int pEdad, String pAula, String pTelefono, String pApodo)
    {
        super(pNombre, pEdad);
        this.aula=pAula;
        this.telefono=pTelefono;
        this.apodo = pApodo;
    }

    public String getAula()
    {
        return this.aula;
    }

    public String getTelefono()
    {
        return this.telefono;
    }

    @Override
    public String getNombre()
    {
        return this.apodo;
    }

    @Override
    public void imprime()
    {
        super.imprime();  //Visualizo nombre y edad "desde" Persona

        System.out.println( "   " + this.getAula() + "  " + this.getTelefono());
    }
    
}
