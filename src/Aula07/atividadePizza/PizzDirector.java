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
public class PizzDirector {
    protected PizzaBuilder montadora;
    public PizzDirector(PizzaBuilder montadora){
        this.montadora = montadora;
    }
    public void construirPizza(){
        montadora.buildBorda();
        montadora.buildIngredientes();
        montadora.buildTamanho();
    }
    public Pizza getPizza(){
        return montadora.getPizza();
    }
}
