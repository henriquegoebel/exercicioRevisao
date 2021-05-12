/*
Super Classe Pessoa - Atributos: nome, endereco,telefone, cpf
Métodos:
Construtor - Carregar informações pessoais
tirarCopia - Aluno, R$ 0,10 por cópia; Professor, R$ 0,05 por cópia; Outro, R$ 0,15 por cópia
 */
package exerciciopooheranca;

import javax.swing.JOptionPane;

/**
 *
 * @author henriquegoebel
 */
public class Pessoa {
    public String nome;
    public String endereco;
    public String telefone;
    public String cpf;
    
    public Pessoa(){
        
    }
    
    public Pessoa (String nome, String endereco, String telefone, String cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
       
    }
    
    public void tirarCopia (String nome, int numeroCopias){
        double valorTotal = numeroCopias * 0.15;
        String texto = "Nome: " + nome + "\n" +
                "Número de Cópias: " + numeroCopias + "\n" + 
                "Valor Total: R$" + valorTotal;
        JOptionPane.showMessageDialog(null, texto);
    }
}
