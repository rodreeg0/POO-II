/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07.aula0504;

/**
 *
 * @author rodriguh
 */
public class VolksBuilder extends CarroBuilder{

    @Override
    public void buildPreco() {
        carro.setPreco(12000.0);
    }

    @Override
    public void buildDscMotor() {
        carro.setDscMotor("1.4 volks");
    }

    @Override
    public void buildAnoDeFabricacao() {
       carro.setAnoDeFabricacao(2015);
    }

    @Override
    public void buildModelo() {
        carro.setModelo("gol");
    }

    @Override
    public void buildMontadora() {
        carro.setMontadora("volkswagen");
    }
    
}
