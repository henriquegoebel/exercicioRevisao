
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author henriquegoebel
 */
public class PessoaFisica extends Cliente{
    
    public String cpf;
    

    public PessoaFisica(){
        
    }
    
    public PessoaFisica(String nome, String telefone, String endereco, String cpf) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
    }
       

    @Override
    public void cadastrar() {
    }

    @Override
    public void excluir() {
    }

    @Override
    public String imprimir() {
        return "\nNome: "+ nome +"\nTelefone: " + telefone + "\nEndereço: " + endereco + "\nCPF: " + cpf + "\n";
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
