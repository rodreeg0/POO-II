/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatternEstruturais.TrabFacade;

/**
 *
 * @author rodriguh
 */
public class Cliente {
    public static void main(String[] args) {
        MaquinaDeLavarFacade facade = new MaquinaDeLavarFacade();
        facade.lavaRoupaMuitoSuja();
        facade.lavaRoupaPoucoSuja();
    }
}
