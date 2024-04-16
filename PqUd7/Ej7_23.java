package PqUd7;

public class Ej7_23 
{
    public static void main(String[] args) throws Exception 
    {
        Participante part1, part2, part3;
        
        double mediaCurso;

        part1 = new Participante("111", "Dicho", "Suso",  3 );

        double [] notas;

        notas = new double[3];
        notas[0] =1.2;
        notas[1] =2.3;
        notas[2] =3.4;
        
        try 
        {
            part1.setNotas(notas);
        }
        catch (Exception ex) 
        {
            System.out.println("" + ex);
        }
        
        
        
        System.out.println(part1.getTodosDatos());

        System.out.println("");
        
        part2 = new Participante("222", "Dado", "Dios", 1);
        notas = new double[4];
        notas[0] =1.2;
        notas[1] =2.3;
        notas[2] =3.4;
        notas[3] =5.4;
        
        try 
        {
            part2.setNotas(notas);
        } 
        catch (Exception ex) 
        {
            System.out.println("" + ex);
        }
        
        System.out.println(part2.getTodosDatos());
        System.out.println("");

        
        part3 = new Participante("333",  "Cardo", "Ana", 2);
        notas = new double[2];
        notas[0] =7.2;
        notas[1] =6.3;
       
        try 
        {
            part3.setNotas(notas);
        } 
        catch (Exception ex) 
        {
            System.out.println("" + ex);
        }

        System.out.println(part3.getTodosDatos());   
    }
}
 