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
public class Cliente {
    public static void main(String[] args) {
        PizzDirector pizzaria = new PizzDirector(new PizzaTomateBuilder());
        pizzaria.construirPizza();
        Pizza pizza = pizzaria.getPizza();
        System.out.println(pizza);
        pizzaria = new PizzDirector(new PizzaQueijoBuilder());
        pizzaria.construirPizza();
        pizza = pizzaria.getPizza();
        System.out.println(pizza);
    }
}
