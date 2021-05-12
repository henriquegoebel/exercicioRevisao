/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author henriquegoebel
 */
public abstract class Cliente {
    
    public String nome;
    public String telefone;
    public String endereco;
    
    public abstract void cadastrar();
    public abstract void excluir();
    
    public String imprimir(){
        return "\nNome: "+ nome +"\nTelefone: " + telefone + "\nEndereço: " + endereco;
    }
    
    public Cliente(){
        
    }
    public Cliente(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
