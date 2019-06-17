package Aula06;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodriguh
 */
public class FactoryPessoaNew implements IFactoryPessoa {

    @Override
    public Pessoa criarPessoa(String nome, String sexo) {
        if ("F".equalsIgnoreCase(sexo)) {
            FactoryMulher fp = new FactoryMulher();
            return fp.criarPessoa(nome, sexo);
        } else if ("M".equalsIgnoreCase(sexo)) {
            FactoryHomem fd = new FactoryHomem();
            return fd.criarPessoa(nome, sexo);
        } else {
            return new Pessoa(nome, sexo);
        }
    }
}
