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
public class SaladaDeFrutasFacade {

    private Banana banana;
    private Kiwi kiwi;

    public SaladaDeFrutasFacade() {
        banana = new Banana("Branca");
        kiwi = new Kiwi();
    }

    public void prepararSalada() {
        banana.descascarBanana();
        banana.fatiarBanana();
        kiwi.descascarKiwi();
        kiwi.fatiarKiwi();
        this.addAçucar();
        this.addCanelaEmPo();
    }

    private void addAçucar(){
        System.out.println("Açucar adicionado.");
    }
    
     private void addCanelaEmPo(){
        System.out.println("Canela em pó adicionada.");
    }
}
