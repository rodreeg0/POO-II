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
public class Cliente {
    public static void main(String[] args) {
        Veiculo veiculo = new Caminhao(new MotorPequeno());
        veiculo.criar();
        veiculo.colocaMotor(new MotorGrande());
        veiculo.criar();
        veiculo = new Carro(new MotorGrande());
        veiculo.criar();
        veiculo.colocaMotor(new MotorPequeno());
        veiculo.criar();
        
    }
}
