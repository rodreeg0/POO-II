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
public class Banana {

    private String tipo;
    private boolean comCasca;
    private boolean fatiada;

    public Banana(String tipo) {
        this.tipo = tipo;
        comCasca = true;
        fatiada = false;
    }

    public void descascarBanana() {
        comCasca = false;
        System.out.println("Banana descascada.");
    }

    public void fatiarBanana() {
        fatiada = true;
        System.out.println("Banana fatiada.");
    }
}
