/*
Classe Aluno - Atributos: curso, nota1, nota2, nota3
Métodos:
Construtor: utilizar comandos super para carregar informações do aluno
Acessores e modificadores: getter and setter
calcularMedia: somar as 3 notas e dividir por 3
verificarAprovado: média >= 7.0: Aluno Aprovado

 */
package exerciciopooheranca;

import javax.swing.JOptionPane;

/**
 *
 * @author henriquegoebel
 */
public class Aluno extends Pessoa{
    public String curso;
    public double nota1, nota2, nota3;
    
    public Aluno(){
        
    }
    
    public Aluno(String nome, String endereco, String telefone, String cpf, String curso, double nota1, double nota2, double nota3){
        super(nome,endereco,telefone,cpf);
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        
    }
    
    public void verificarAprovado(String nome){
        if((nota1 + nota2 + nota3)/3 >= 7.0){
            JOptionPane.showMessageDialog(null, "Aluno " + nome +" aprovado!");
        }else{
            JOptionPane.showMessageDialog(null, "Aluno " + nome + " não Aprovado!");
        }
           
    }
    
  
    @Override
    public void tirarCopia (String nome, int numeroCopias){
        double valorTotal = numeroCopias * 0.10;
        String texto = "Nome: " + nome + "\n" +
                "Número de Cópias: " + numeroCopias + "\n" + 
                "Valor Total: " + "R$" + valorTotal;
        JOptionPane.showMessageDialog(null, texto);
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
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
