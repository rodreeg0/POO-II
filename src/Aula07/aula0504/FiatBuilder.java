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
public class FiatBuilder extends CarroBuilder{

    @Override
    public void buildPreco() {
        carro.setPreco(33000.0);
    }

    @Override
    public void buildDscMotor() {
        carro.setDscMotor("1.4 fiat");
    }

    @Override
    public void buildAnoDeFabricacao() {
       carro.setAnoDeFabricacao(2018);
    }

    @Override
    public void buildModelo() {
        carro.setModelo("fiat");
    }

    @Override
    public void buildMontadora() {
        carro.setMontadora("fiat");
    }
    
}
