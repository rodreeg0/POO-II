/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatternEstruturais.Bridge;

/**
 *
 * @author rodriguh
 */
public class Caminhao extends Veiculo{
    public Caminhao(final Motor motor){
        this.motor = motor;
    }

    @Override
    public void criar() {
        System.out.println("\nO caminhão está pronto!");
        motor.info();
    }
}
