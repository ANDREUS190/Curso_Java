package PqUd4;

public class Ej4_7A 
{
    public static void main(String[] args) 
    {
        Maquinita ma1, ma2;
        
        ma1 = new Maquinita();
        ma2 = new Maquinita();

        ma1.setCodigo();
        ma1.setMemoria();
        ma1.setActualizable();

        ma2.setCodigo();
        ma2.setMemoria();
        ma2.setActualizable();

        ma1.visualizaDatos();
        ma2.visualizaDatos();

        ma2.memoria = 120;
        ma1.actualizable = true;


        ma1.visualizaDatos();
        ma2.visualizaDatos();
    }
}
