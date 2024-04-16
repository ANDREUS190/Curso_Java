package PqUd4;

public class PpalRectangulo 
{
    public static void main(String[] args) 
    {
        //Declaramos variables(rect1 y rect2) objeto
        //de la clase Rectangulo
        Rectangulo rect1, rect2; 
        
        //Creamos objeto(instancia) mediante el
        //método Constructor Rectangulo()
        rect1 = new Rectangulo();
        rect2 = new Rectangulo();
        
        //Asignamos valores a los atributos
        // del objeto:
        rect1.altura = 9;
        rect1.base = 7;
        rect1.color = "Negro";
        
        System.out.println("Altura: " + rect1.altura);
        System.out.println("Base: " + rect1.base);
        System.out.println("Color: " + rect1.color);
        System.out.println("Área: " + rect1.area);
        rect1.setArea();
        System.out.println("Área desp de la llamada: " + rect1.area);


        System.out.println("---------------");
        
        rect2.altura = 12.5;
        rect2.base = 15.8;
        rect2.color = "Rojo";
        
        System.out.println("Altura: " + rect2.altura);
        System.out.println("Base: " + rect2.base);
        System.out.println("Color: " + rect2.color);
        System.out.println("Área: " + rect2.area);
        rect2.setArea();
        System.out.println("Área desp de la llamada: " + rect2.area);
    }
}
