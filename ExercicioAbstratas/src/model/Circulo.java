/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author henriquegoebel
 */
public class Circulo extends FiguraGeometrica{

    
    public Circulo(){
        
    }
    

    @Override
    public void Perimetro() {
        String var = JOptionPane.showInputDialog("Aponte o valor do raio do círculo: ");
        double raio = Double.valueOf(var);
        double perimetro = 2 * Math.PI * raio;
        JOptionPane.showMessageDialog(null, "O valor do perímetro do círculo é = " + perimetro);
    }

    @Override
    public void Area() {
        String var = JOptionPane.showInputDialog("Aponte o valor do raio do círculo: ");
        double raio = Double.valueOf(var);
        double area = Math.PI * (Math.pow(raio, 2));
        JOptionPane.showMessageDialog(null, "O valor do perímetro do círculo é = " + area);
    }
    
}
