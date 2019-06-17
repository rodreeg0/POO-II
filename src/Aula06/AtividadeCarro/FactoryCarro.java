/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula06.AtividadeCarro;

import Aula06.AtividadeFuncionario.*;



/**
 *
 * @author rodriguh
 */
public class FactoryCarro implements IFactoryCarro{
    @Override
    public Carro criarCarro(String nome, String modelo) {
        if ("CORSEL".equalsIgnoreCase(modelo)) {
            FactoryCorsel fp = new FactoryCorsel();
            return fp.criarCarro(nome, modelo);
        } else if ("SANTANA".equalsIgnoreCase(modelo)) {
            FactorySantana fd = new FactorySantana();
            return fd.criarCarro(nome, modelo);
        } else if("DELREY".equalsIgnoreCase(modelo)){
            FactoryDelRey fd = new FactoryDelRey();
            return fd.criarCarro(nome, modelo);
            
        }else
            return new Carro(nome, modelo);
    }
}
