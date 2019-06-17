/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatternEstruturais.TrabFacade.ExemploSaladaDeFrutas;

/**
 *
 * @author rodriguh
 */
public class Kiwi {

    private String tipo;
    private boolean comCasca;
    private boolean fatiado;

    public Kiwi() {
        comCasca = true;
        fatiado = false;
    }

    public void descascarKiwi() {
        comCasca = false;
        System.out.println("Kiwi descascado.");
    }

    public void fatiarKiwi() {
        fatiado = true;
        System.out.println("Kiwi fatiado.");
    }
}
