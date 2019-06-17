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
public class ConcessionariaDirector {
    protected CarroBuilder montadora;
    public ConcessionariaDirector(CarroBuilder montadora){
        this.montadora = montadora;
    }
    public void construirCarro(){
        montadora.buildPreco();
        montadora.buildAnoDeFabricacao();
        montadora.buildModelo();
        montadora.buildDscMotor();
        montadora.buildMontadora();
    }
    public CarroProduct getCarro(){
        return montadora.getCarro();
    }
}
