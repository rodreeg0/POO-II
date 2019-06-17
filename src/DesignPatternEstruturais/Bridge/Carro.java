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
public class Carro extends Veiculo{

    
    public Carro(final Motor motor){
        this.motor = motor;
    }
    @Override
    public void criar() {
        System.out.println("\nO carro está pronto!");
        motor.info();
    }
    
}
