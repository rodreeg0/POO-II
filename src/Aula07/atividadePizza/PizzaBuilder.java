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
public abstract class PizzaBuilder {
    protected Pizza pizza = new Pizza();
    public abstract void buildTamanho();
    public abstract void buildBorda();
    public abstract void buildIngredientes();
    public Pizza getPizza(){
        return pizza;
    }
}
