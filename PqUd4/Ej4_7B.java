package PqUd4;

public class Ej4_7B 
{
    public static void main(String[] args) 
    {
        Maquinita ma1;
        ma1 = new Maquinita();

        ma1.setCodigo();
        ma1.setMemoria();
        ma1.setActualizable();

        System.out.println("La serie que me devuelven es: " + ma1.getSerieMem());

        System.out.println("\nAntes de incrementar memoria...");
        ma1.visualizaDatos();

        ma1.incrementaMem();
        System.out.println("\nDespués de incrementar memoria...");
        ma1.visualizaDatos();
    }
}
