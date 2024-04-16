package PqUd6;

public class Caballo extends Animal
{
    private int nPatas;
    //El atributo raza no incluyo porque lo hereda(super) de la superClase Animal
  
    public Caballo(String pRaza, int pNPatas)
    {
        super(pRaza); //con super() estamos llamando al contrucor de la superclase Animal
        
        this.nPatas = pNPatas;
    }
    
    
    @Override
    public void visualizaDatos()
    {
        //@Override indica que estamos rescribiendo, redefiniendo un metodo ya exsitente (visualizaDatos de la superclase Animal
        super.visualizaDatos();// referencia a la superclase animal
        
        //este super,visualiza datos ejecutara todo el codigo del visualizadatso de la clase animal
        System.out.println("Nº Patas: " + this.nPatas);
    }
}
