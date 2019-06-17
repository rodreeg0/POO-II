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
public class PizzaQueijoBuilder extends PizzaBuilder{

    

    @Override
    public void buildBorda() {
        pizza.setBorda("catupiri");
    }

    @Override
    public void buildIngredientes() {
       pizza.setIngredientes("queijo");
    }


    @Override
    public void buildTamanho() {
       pizza.setTamanho("pequena");
    }
    
}
