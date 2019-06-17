/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula06.AtividadeCarro;

/**
 *
 * @author rodriguh
 */
public class Carro implements ICarro{
    String nome;
    String modelo;
    
    public Carro (String nome, String cargo){
        this.nome = nome;
        this.modelo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return modelo;
    }

    public void setCargo(String cargo) {
        this.modelo = cargo;
    }
    
    
    
}
