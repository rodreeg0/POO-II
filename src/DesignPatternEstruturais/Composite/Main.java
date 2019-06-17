/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatternEstruturais.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodriguh
 */
public class Main {
    public static void main(String[] args) {
        List<Component> lista = new ArrayList<>();
        Caixa caixa1 = new Caixa("Caixa utensilios domesticos");
        Caixa caixa2 = new Caixa("Caixa talheres");
        Item faca = new Item("Faca");
        Item concha = new Item("Concha");
        Item colher = new Item("Colher");
        caixa1.add(faca);
        caixa2.add(concha);
        caixa2.add(colher);
        caixa1.add(caixa2);
        caixa1.getPrint();
        
        lista = caixa2.getChildren();
        for(Component l : lista){
            System.out.println(l.getNome());
        }
        
        
    }
}
