
package model;

import javax.swing.JOptionPane;


/**
 *
 * @author henriquegoebel
 */
public class Quadrado extends FiguraGeometrica{

    public Quadrado(){
        
    }
    
    @Override
    public void Perimetro() {
        String var = JOptionPane.showInputDialog("Aponte o valor do lado do quadrado: ");
        double lado = Double.valueOf(var);
        double perimetro = 4 * lado;
        JOptionPane.showMessageDialog(null, "O valor do perímetro é = " + perimetro);
    }

    @Override
    public void Area() {
        String var = JOptionPane.showInputDialog("Aponte o valor do lado do quadrado: ");
        double lado = Double.valueOf(var);
        double area = Math.pow(lado, 2);
        JOptionPane.showMessageDialog(null, "O valor da área é = " + area);
    }
    
    
    
    
    
    
    
}
