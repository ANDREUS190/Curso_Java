/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd4;

/**
 *
 * @author recatala
 */
public class Alumno 
{
    String nombre;
    String apellidos;
    int anyoNacim;
    String numIdent;
    String grupo = "DAW1T";
    int edad;
    
    //Ejercicio 4_5: añadimos atributos de notas
    double notaEv1;
    double notaEv2;
    double notaEv3;
    
    
     //Ejercicio 4_6
    double media; //mantiene la nota media de las 3
    double max; //mantiene la nota máxima de las 3
    double min; //mantiene la nota mínima de las 3
    
    
    //Ejericicio 4_17
    String modulo;
    boolean elite; // indica si el alumno pertenece o no a la élite
    
    
    //Ejericicio 4_17
    void visualizaDatos()
    {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Grupo: " + this.getGrupo());
        System.out.println("Módulo: "+ this.modulo);
        System.out.printf("Nota 1: %.2f \n", this.getNotaEv1());
        System.out.printf("Nota 2: %.2f \n", this.getNotaEv2());
        System.out.printf("Nota 3: %.2f \n", this.getNotaEv3());
        if (this.elite == true)
        {
            System.out.print("Es");
        }
        else
        {
            System.out.print("No es");
        }
        System.out.println(" de la élite.");
    }    
    
    void incrementaNota()
    {
        if (this.elite == true)
        {
            this.notaEv3 = (this.getMedia() + 1.0);
        }
    }
    
    
    void setAnyoNacimiento (int pAnyoNacim)
    {
        this.anyoNacim = pAnyoNacim;
    }
    
    void setEdad(int pEdad)
    {
        this.edad = pEdad;
    }
    
    
    int calculaEdad(int pAnyoActual)
    {
        int edadCalc;
        
        edadCalc = pAnyoActual - this.anyoNacim;

        return edadCalc;
    }
    
    
    
    
    void setNombre(String pNombre)
    {
        //El atributo nombre se informa
        //con el valor del parámetro pNombre
        this.nombre = pNombre;
    }
    
    void setNombreConcat(String pCad1, String pCad2)
    {
        this.nombre = pCad1 + pCad2;
    }
    
    String getGrupo()
    {
        //Devuelve el contenido del
        //atributo grupo
        return this.grupo;
    }
    
    void setGrupo(String pGrupo)
    {
        //Informa el atributo grupo
        //con el contenido del 
        //parámetro pGrupo
        this.grupo = pGrupo;
    }
    
    void setGrupo(String pGrupo, String pCad)
    {
        this.grupo = pGrupo + pCad;
    }
    
    //Ejercicio 4_5: añadimos métodos  de notas
    double getNotaEv1()
    {
        return notaEv1;
    }

    double getNotaEv2()
    {
        return notaEv2;
    }

    double getNotaEv3()
    {
        return notaEv3;
    }
    
    String getCadNotasAlumno()
    {
        String cadena;
        
        cadena = this.nombre + " " + this.apellidos + 
                " obtuvo " + this.getNotaEv1() + ", " + 
                this.getNotaEv2() + ", " 
                + this.getNotaEv3();
                
        return cadena;    
    }
    
//    void visualizaMedia()
//    {
//
//        calculaMedia();
//        
//        //Se podría hacer con printf:
//        System.out.println("La media es " 
//                + media);
//    }
    
    //Ejercicio 4_6: añadimos métodos  de media, min y max
    void calculaMedia()
    {
        double media;

        media = ((getNotaEv1()  + 
                getNotaEv2() +
                getNotaEv3())/3);
        this.media = media;
    }

    double calculaMax()
    {
        //Realizado con variable "auxiliar"
        double vMax;
        
        vMax = getNotaEv1();
        
        if (getNotaEv2() > vMax)
        {
            vMax = getNotaEv2();
        }
        
        if (getNotaEv3() > vMax)
        {
            vMax = getNotaEv3();
        }
        
        
        max = vMax;
        
        return max;
    }

    double calculaMin()
    {
        double vMin;
        
        vMin = getNotaEv1();
        
        if (getNotaEv2() < vMin)
        {
            vMin = getNotaEv2();
        }
        if (getNotaEv3() < vMin)
        {
            vMin = getNotaEv3();
        }
        
        min = vMin;
        
        return min;
    }
    
    
    //Ejercicio 4_7: añadimos métodos  getMedia() y visualizaMedia() que se cambia por el anterior
    double getMedia()
    {
        return media;
    }

    //  4_7  
    void visualizaMedia()
    {
        System.out.println("La media es " + getMedia());
    }
    
    
    
}
