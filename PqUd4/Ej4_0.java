package PqUd4;


public class Ej4_0 
{

    
    

    public static void main(String[] args) 
    {
        double mediaBase, mediaAltura;
        
        Rectangulo rect1, rect2;  //Declaramos vbles. objeto
        rect1 = new Rectangulo(); //Creamos instancia(objeto) mediante 
                                  //el método contructor Rectangulo()
        rect2 = new Rectangulo();
        
        //Asignamos valores a los atributos del objeto:
        rect1.altura = 12.5;
        rect1.base = 15.8;
        rect1.color = "Rojo";
        
        //Asignamos valores a los atributos del objeto:
        rect2.altura = 9;
        rect2.base = 7;
        rect2.color = "Negro";
        
        System.out.println("Área de rect1: " + rect1.area);
        rect1.setArea();
        System.out.println("Área de rect1: " + rect1.area);

        System.out.println("Área de rect2: " + rect2.area);
        rect2.setArea();
        System.out.println("Área de rect2: " + rect2.area);
        
        
        System.out.println("---------EJER 4.0-----------------");
        //----Ejercicio 4.0---------------------------------------------
        mediaAltura = ((rect1.altura + rect2.altura)/2);
        mediaBase = ((rect1.base + rect2.base)/2);

        rect1.altura = mediaAltura;
        rect1.base = mediaBase;
        rect1.setArea();

        rect2.altura = mediaAltura;
        rect2.base = mediaBase;
        rect2.setArea();

        System.out.println("Después de redimensionarlos...");
        System.out.println("La base de rect1 es " + rect1.base);
        System.out.println("La altura de rect1 es " + rect1.altura);
        System.out.println("El área de rect1 es " + rect1.area);
        System.out.println("La base de rect2 es " + rect2.base);
        System.out.println("La altura de rect2 es " + rect2.altura);
        System.out.println("El área de rect2 es " + rect2.area);

        
    }

}
