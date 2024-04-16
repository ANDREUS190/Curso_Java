package PqUd6;

public class Ej6_3 
{
    public static void main(String[] args) 
    {
        Multimedia mult1, mult2;
        mult1 = new Multimedia("TORO", "MANOLO", "MP4", 10);
        
        mult2 = new Multimedia("TORO", "MANOLO", "MP4", 10);
        
        System.out.println(mult1.esIgual(mult2));
    }
}
