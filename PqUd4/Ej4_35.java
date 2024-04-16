package PqUd4;

public class Ej4_35 
{
    public static void main(String[] args) throws Exception
    {
        Movil mov1;
        mov1 = new Movil("Actung", "Orbit", 166.78, 400);
        
        mov1.visualizaPrecio();
        
        mov1.setModeloPrecio("Orbit", 450);
        
        mov1.setModeloPrecio("xiaomi", 500);
        System.out.println("La marca es: " + mov1.modelo);
    }
}
