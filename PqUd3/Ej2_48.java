package PqUd3;


public class Ej2_48 
{

    public static void main(String[] args) 
    {
        int tabla, multiplicar, multiplicador, resultado;
        
        tabla = 0;
        multiplicar = 0;
        multiplicador = 0;
        
        do
        {  
            System.out.println("Tabla del " + tabla);
            
            do
            {
                resultado = multiplicar * multiplicador;
                System.out.println(multiplicar + " * " + multiplicador + " = " + resultado);
                multiplicador = multiplicador + 1;
                
            }while(multiplicador <= 10);
            
            tabla = tabla + 1;
            multiplicar = multiplicar + 1;
            multiplicador = 0;
            System.out.println("");
        
        }while (tabla <= 10);
        


    }

}
