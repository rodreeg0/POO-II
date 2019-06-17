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
public class MaquinaDeLavarFacade {

    MaquinaDeLavar maquina;

    public MaquinaDeLavarFacade() {
        maquina = new MaquinaDeLavar();
    }

    public void lavaRoupaMuitoSuja() {
        maquina.setTemperaturaAgua(100);
        maquina.setDuracaoCicloLavagem(90);
        maquina.addSabaoEmPo();
        maquina.addAmaciante();
        maquina.iniciarLavagem();
    }

    public void lavaRoupaPoucoSuja() {
        maquina.setTemperaturaAgua(40);
        maquina.setDuracaoCicloLavagem(40);
        maquina.addSabaoEmPo();
        maquina.addAmaciante();
        maquina.iniciarLavagem();
    }
}
