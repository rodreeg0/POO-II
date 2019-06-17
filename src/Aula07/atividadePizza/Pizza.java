/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07.atividadePizza;

/**
 *
 * @author rodriguh
 */
public class Pizza {

    private String tamanho;
    private String borda;
    private String ingredientes;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getBorda() {
        return borda;
    }

    public void setBorda(String borda) {
        this.borda = borda;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "PizzaProduct{" + "tamanho=" + tamanho + ", borda=" + borda + ", ingredientes=" + ingredientes + '}';
    }
    
    
}