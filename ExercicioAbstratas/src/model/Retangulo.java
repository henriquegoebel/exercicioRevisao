/*

 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author henriquegoebel
 */
public class Retangulo extends FiguraGeometrica{

    
    public Retangulo(){
        
    }
    
    
    @Override
    public void Perimetro() {
        String var = JOptionPane.showInputDialog("Aponte o valor da base do retângulo: ");
        double base = Double.valueOf(var);
        var = JOptionPane.showInputDialog("Aponte o valor da altura do retângulo: ");
        double altura = Double.valueOf(var);
        double perimetro = 2 * (base + altura);
        JOptionPane.showMessageDialog(null, "O valor do perímetro é = " + perimetro);
    }

    @Override
    public void Area() {
        String var = JOptionPane.showInputDialog("Aponte o valor da base do retângulo: ");
        double base = Double.valueOf(var);
        var = JOptionPane.showInputDialog("Aponte o valor da altura do retângulo: ");
        double altura = Double.valueOf(var);
        double area = base * altura;
        JOptionPane.showMessageDialog(null, "O valor do perímetro é = " + area);
    }
    
}
