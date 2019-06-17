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
public class MaquinaDeLavar {
    private int temperaturaAgua;
    private int duracaoCicloLavagem;

    public void addSabaoEmPo(){
        System.out.println("Sabão em pó adicionado.");
    }
    
    public void addAmaciante(){
        System.out.println("Amaciante adicionado.");
    }
    
    public void iniciarLavagem(){
        System.out.println("Lavagem iniciada.\n"
                + "Temperatura da agua: "+this.getTemperaturaAgua()+"\n"
                + "Ciclo lavagem: "+ this.getDuracaoCicloLavagem()+"\n");
    }
    
    public int getTemperaturaAgua() {
        return temperaturaAgua;
    }

    public void setTemperaturaAgua(int temperaturaAgua) {
        this.temperaturaAgua = temperaturaAgua;
    }

    public int getDuracaoCicloLavagem() {
        return duracaoCicloLavagem;
    }

    public void setDuracaoCicloLavagem(int duracaoCicloLavagem) {
        this.duracaoCicloLavagem = duracaoCicloLavagem;
    }
    
    
}
