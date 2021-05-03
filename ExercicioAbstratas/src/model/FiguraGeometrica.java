/*
Construir uma classe abstrata FiguraGeometrica com métodos
abstratos para o cálculo de área e perímetro. O sistema deve possuir
as classes concretas Círculo, Quadrado e Retângulo, que herdam da
classe FiguraGeométrica e que devem implementar os métodos da
classe abstrata.
 */
package model;

/**
 *
 * @author henriquegoebel
 */
public abstract class FiguraGeometrica {
    
    public FiguraGeometrica(){
        
    }
    public abstract void Perimetro();
    public abstract void Area();
    
    
}
