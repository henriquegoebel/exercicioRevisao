
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.PessoaFisica;
import model.PessoaJuridica;

/**
 *
 * @author henriquegoebel
 */
public class Main {

    
    public static void main(String[] args) {
        
        String opcao = "s";
        
        List<PessoaFisica> listaPessoaFisica = new ArrayList<>();
        List<PessoaJuridica> listaPessoaJuridica = new ArrayList<>();
        
        while(!opcao.equalsIgnoreCase("n")){
            String texto;
            texto = "Digite sue opção: \n" +
                    "1 - Adicionar Cliente Pessoa Física \n" +
                    "2 - Remover Cliente Pessoa Física \n" + 
                    "3 - Listar Clientes Pessoa Física \n" +
                    "\n" +
                    "4 - Adicionar Cliente Pessoa Jurídica \n" +
                    "5 - Remover Cliente Pessoa Jurídica \n" + 
                    "6 - Listar Clientes Pessoa Jurídica \n" +
                    "\n" +
                    "n - Sair ";
            opcao = JOptionPane.showInputDialog(texto);
            
            switch (opcao){
                case "1": 
                    PessoaFisica pf = new PessoaFisica();
                    String nomepf = JOptionPane.showInputDialog("Nome da Pessoa Física:");
                    pf.setNome(nomepf);
                    
                    String enderecopf = JOptionPane.showInputDialog("Endereço:");
                    pf.setEndereco(enderecopf);
                    
                    String telefonepf = JOptionPane.showInputDialog("Telefone:");
                    pf.setTelefone(telefonepf);
                    
                    String cpf = JOptionPane.showInputDialog("CPF:");
                    pf.setCpf(cpf);
                    
                    listaPessoaFisica.add(pf);
                    
                    break;
                    
                case "2": 
                    int posicaopf = Integer.valueOf(JOptionPane.showInputDialog("Informe a posição que deseja remover:"));
                    listaPessoaFisica.remove(posicaopf);
                    break;
                    
                case "3":
                    String conteudopf = "";
                    for (PessoaFisica pessoaFisica : listaPessoaFisica) {
                        conteudopf += pessoaFisica.imprimir() + "\n";
                       
                    }
                    JOptionPane.showConfirmDialog(null, conteudopf);
                    break; 
                    
                    
                case "4": 
                    PessoaJuridica pj = new PessoaJuridica();
                    String nomepj = JOptionPane.showInputDialog("Nome da Pessoa Jurídica:");
                    pj.setNome(nomepj);
                    
                    String enderecopj = JOptionPane.showInputDialog("Endereço:");
                    pj.setEndereco(enderecopj);
                    
                    String telefonepj = JOptionPane.showInputDialog("Telefone:");
                    pj.setTelefone(telefonepj);
                    
                    String cnpj = JOptionPane.showInputDialog("CNPJ:");
                    pj.setCnpj(cnpj);
                    
                    listaPessoaJuridica.add(pj);
                    
                    break;
                    
                case "5": 
                    int posicaopj = Integer.valueOf(JOptionPane.showInputDialog("Informe a posição que deseja remover:"));
                    listaPessoaJuridica.remove(posicaopj);
                    break;
                    
                case "6":
                    String conteudopj = "";
                    for (PessoaJuridica pessoaJuridica : listaPessoaJuridica) {
                        conteudopj += pessoaJuridica.imprimir() + "\n";
                       
                    }
                    JOptionPane.showConfirmDialog(null, conteudopj);
                    break;
                    
                case "n":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Incorreta");    
                
            }    
                    
        }    
            
            
    }
    
}
