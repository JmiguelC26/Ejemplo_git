/**
*Representa la estructura de figuras geométricas.
*Las subclases deben implementar los métodos para calcaular área y perímetro
*
*@autor miguel
*/
public abstract class Figura {
   /**
   *Retorna el área de la figura
   *
   *@return Área como double.*/
    
    public abstract double area();
    /**
    *Retorna el perímetro de la figura.
    *
    *@return Perímetro como double.
    */
    public abstract double perimetro();
}

