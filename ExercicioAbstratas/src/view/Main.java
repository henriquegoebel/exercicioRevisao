/*
Construir uma classe abstrata FiguraGeometrica com métodos
abstratos para o cálculo de área e perímetro. O sistema deve possuir
as classes concretas Círculo, Quadrado e Retângulo, que herdam da
classe FiguraGeométrica e que devem implementar os métodos da
classe abstrata.
 */
package view;

import model.Circulo;
import model.Quadrado;
import model.Retangulo;

/**
 *
 * @author henriquegoebel
 */
public class Main {


    public static void main(String[] args) {
        
        
        Quadrado q = new Quadrado();
        Circulo c = new Circulo();
        Retangulo r = new Retangulo();
        
        
        q.Area();
        q.Perimetro();
        c.Area();
        c.Perimetro();
        r.Area();
        r.Perimetro();
        
    }
    
}
