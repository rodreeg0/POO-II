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
public class Cliente {
    public static void main(String[] args) {
        ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());
        concessionaria.construirCarro();
        CarroProduct carro = concessionaria.getCarro();
        System.out.println(carro);
        concessionaria = new ConcessionariaDirector(new VolksBuilder());
        concessionaria.construirCarro();
        carro = concessionaria.getCarro();
        System.out.println(carro);
    }
}
