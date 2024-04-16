package PqUd4;


public class Ej4_1 
{
    public static void main(String[] args) 
    {
        Alumno al1, al2;
        al1 = new Alumno();
        al2 = new Alumno();
        
        al1.nombre = "Pepe";
        System.out.println("El nombre "
                + "es " + al1.nombre);    
        System.out.println("El grupo "
                + "es " + al1.grupo);    

        al2.nombre = "Luisa";
        System.out.println("El nombre "
                + "es " + al2.nombre);    
        
        //ALIAS
        al2 = al1;
        System.out.println("El nombre "
                + "es " + al1.nombre);    
        System.out.println("El nombre "
                + "es " + al2.nombre);    
        
        al2.nombre ="Maradona";
        System.out.println("El nombre "
                + "es " + al1.nombre);    
        System.out.println("El nombre "
                + "es " + al2.nombre);    
        
    }
}
