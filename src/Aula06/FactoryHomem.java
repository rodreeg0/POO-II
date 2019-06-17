/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula06;

/**
 *
 * @author rodriguh
 */
public class FactoryHomem implements IFactoryPessoa {

    @Override
    public Pessoa criarPessoa(String nome, String sexo) {
        return new Homem(nome, sexo);
    }
}
