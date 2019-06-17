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
public class Main {

    public static void main(String[] args) {
        FactoryCarro factory = new FactoryCarro();
        Carro f1 = factory.criarCarro("Rodrigo", "santana");
        Carro f2 = factory.criarCarro("joj", "delrey");
        Carro f3 = factory.criarCarro("XXXX", "");
        System.out.println(f1.info());
        System.out.println(f2.info());
        System.out.println(f3.info());
    }

}
