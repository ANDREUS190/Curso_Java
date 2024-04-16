package PqUd7;

public class PruArrayMult 
{
    public static void main(String[] args) 
    {
        int[][] tabla = new int[3][5];
        
        tabla[0][0] = 1;
        tabla[0][1] = 2;
        tabla[1][0] = 3;
        tabla[1][1] = 4;
        tabla[2][0] = 5;
        tabla[2][1] = 6;

        int m;
        int k;
        int num;
        
        num = 0;
        
        for(m=0; m<=tabla.length-1; m=m+1)
        {
            System.out.println("tabla[m].length: " + tabla[m].length);
            for(k=0; k<=tabla[m].length-1; k=k+1)
            {
                System.out.println(tabla[m][k]);
            }
        }
        
        System.out.println("COL: " + tabla.length);
        System.out.println("FILAS: " + tabla[0].length);
        System.out.println("FILAS COLUMNS: " + (tabla.length * tabla[0].length));
    }
}
