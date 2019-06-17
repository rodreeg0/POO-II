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
public class PizzaBaconBuilder extends PizzaBuilder{

    @Override
    public void buildTamanho() {
        pizza.setBorda("grande");
    }

    @Override
    public void buildBorda() {
        pizza.setIngredientes("chocolate");
    }

    @Override
    public void buildIngredientes() {
       pizza.setIngredientes("tomate");
    }

    
}
