package PqUd7;

public class Ej7_24 
{
    public static void main(String[] args) throws Exception 
    {
        ParticipanteNuevo part1, part2, part3;
        
        double mediaCurso;

        part1 = new ParticipanteNuevo("111", "Dicho", "Suso",  3 );

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
        
        
        part2 = new ParticipanteNuevo("222", "Dado", "Dios", 4);
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


        
        part3 = new ParticipanteNuevo("333",  "Cardo", "Ana", 2);
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
        mediaCurso = ParticipanteNuevo.getMediaCurso(part1.getMedia(), part2.getMedia(), part3.getMedia());
        
        System.out.println(mediaCurso);      
    }
}
