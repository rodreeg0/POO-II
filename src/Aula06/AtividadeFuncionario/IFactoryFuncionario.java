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
public interface IFactoryFuncionario {
    public Funcionario criarPessoa(String nome, String cargo);
}
