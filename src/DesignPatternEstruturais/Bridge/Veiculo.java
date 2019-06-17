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
public abstract class Veiculo {
    protected Motor motor;
    public abstract void criar();
    public void colocaMotor(final Motor motor){
        this.motor = motor;
    }
        
    
}
