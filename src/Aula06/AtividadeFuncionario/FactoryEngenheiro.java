/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula06.AtividadeFuncionario;

import Aula06.*;

/**
 *
 * @author rodriguh
 */
public class FactoryEngenheiro implements IFactoryFuncionario {

    @Override
    public Funcionario criarPessoa(String nome, String sexo) {
        return new Engenheiro(nome, sexo);
    }
}
