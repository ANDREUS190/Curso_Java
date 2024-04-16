package PqUd6;

public class Alumno extends Persona
{
    private String grupo;
    private int horas;

    public Alumno(String pGrupo, int pHoras, String pNombre, int pEdad) 
    {
        super(pNombre, pEdad); //Persona(pNombre, pEdad)
        this.grupo = pGrupo;
        this.horas = pHoras;
    }
    
    @Override
    public void visualiza()
    {
        super.visualiza();
        System.out.println("Grupo: " + this.grupo + ",  Horas: " + this.horas);
    }
}
