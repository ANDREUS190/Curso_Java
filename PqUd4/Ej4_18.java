package PqUd4;

public class Ej4_18 
{
    public static void main(String[] args) 
    {
        int k,dif;

        Alumno al1;
        al1 = new Alumno();

        Profesor prof1;
        prof1 = new Profesor();

        al1.setEdad(22);
        prof1.setEdad(31);

        //Si edad de profe es mayor que la de alumno
        if (prof1.getEdad() > al1.edad)
        {
            //Calculamos la diferencia de edad entre alumno y profesor
            dif = prof1.getEdad() - al1.edad;
            //Mostramos la serie con los años de diferencia
            for (k = dif; k >= 1; k = k - 1)
            {
                System.out.print(k + ", ");
            }
        }
        
        System.out.println("");
        System.out.println("Edad profesor (antes rejuvenece(40)): " + prof1.getEdad());
        prof1.rejuvenece(40);
        System.out.println("Edad profesor (después rejuvenece(40) y antes rejuvenece(27)):" + prof1.getEdad());
        prof1.rejuvenece(27);
        System.out.println("Edad profesor (después rejuvenece(27)):" + prof1.getEdad());
        
    }
}
