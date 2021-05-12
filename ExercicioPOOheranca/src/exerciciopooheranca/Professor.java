/*
 Classe Professor - Atributos: curso, salário
Métodos:
Construtor: utilizar comandos super para carregar informações do professor
Acessores e Modificadores
calcularSalarioLiquido: salario bruto - INSS - IR
 */
package exerciciopooheranca;

import javax.swing.JOptionPane;

/**
 *
 * @author henriquegoebel
 */
public class Professor extends Pessoa{
    String curso;
    double salario;
    
    
    public Professor(){
        
    }
    
    public Professor(String nome, String endereco, String telefone, String cpf, String curso, double salario){
        super(nome, endereco, telefone, cpf);
        this.curso = curso;
        this.salario = salario;
    }
    
    public void calcularSalarioLiquido(String nome){
        double salarioLiquido = salario - ((salario - (salario * 0.11)) * 0.27);
        String texto = "Nome: " + nome + "\n" +
                "Salário Líquido: R$" + salarioLiquido;
        JOptionPane.showMessageDialog(null, texto);
    }
    
    @Override
    public void tirarCopia (String nome, int numeroCopias){
        double valorTotal = numeroCopias * 0.05;
        String texto = "Nome: " + nome + "\n" +
                "Número de Cópias: " + numeroCopias + "\n" + 
                "Valor Total: R$" + valorTotal;
        JOptionPane.showMessageDialog(null, texto);
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
