/*
Super Classe Pessoa - Atributos: nome, endereco,telefone, cpf
Métodos:
Construtor - Carregar informações pessoais
tirarCopia - Aluno, R$ 0,10 por cópia; Professor, R$ 0,05 por cópia; Outro, R$ 0,15 por cópia

Classe Aluno - Atributos: curso, nota1, nota2, nota3
Métodos:
Construtor: utilizar comandos super para carregar informações do aluno
Acessores e modificadores: getter and setter
calcularMedia: somar as 3 notas e dividir por 3
verificarAprovado: média >= 7.0: Aluno Aprovado

Classe Professor - Atributos: curso, salário
Métodos:
Construtor: utilizar comandos super para carregar informações do professor
Acessores e Modificadores
calcularSalarioLiquido: salario bruto - INSS - IR
 */
package exerciciopooheranca;

/**
 *
 * @author henriquegoebel
 */
public class Main {

    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("João da Cantina", null, "(51)999887766", "123.123.123-12");
        Aluno a1 = new Aluno("Maria", "Rua das Rosas 123", "(54)998998877", "321.321.321-32", "Ciência da Computação", 0, 0, 0);
        Professor prof1 = new Professor("Paulo", "Rua dos Cravos 555", "(51)981223344", "345.345.345-34", "Análise e Desenvolvimento de Sistemas", 2300);
        
        p1.tirarCopia("João da Cantina", 10);
        
        a1.setNota1(5.5);
        a1.setNota2(9.5);
        a1.setNota3(7.8);
        a1.verificarAprovado("Maria");
        
        prof1.calcularSalarioLiquido("Paulo");
    }
    
}
