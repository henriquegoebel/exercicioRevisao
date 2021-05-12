
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author henriquegoebel
 */
public class PessoaJuridica extends Cliente{
    
    public String cnpj;
    
    
    public PessoaJuridica(){
        
    }

    public PessoaJuridica(String nome, String telefone, String endereco, String cpnj) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
    }

    @Override
    public void cadastrar() {
    }

    @Override
    public void excluir() {
    }

    @Override
    public String imprimir() {
        return "\nNome: "+ nome +"\nTelefone: " + telefone + "\nEndereço: " + endereco + "\nCNPJ: " + cnpj + "\n";

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
}
