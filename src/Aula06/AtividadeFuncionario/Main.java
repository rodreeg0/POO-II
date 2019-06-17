/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula06.AtividadeFuncionario;

/**
 *
 * @author rodriguh
 */
public class Main {

    public static void main(String[] args) {
        FactoryFuncionario factory = new FactoryFuncionario();
        Funcionario f1 = factory.criarPessoa("Rodrigo", "engenheiro");
        Funcionario f2 = factory.criarPessoa("joj", "mecanico");
        Funcionario f3 = factory.criarPessoa("XXXX", "arquiteto");
        System.out.println(f1.info());
        System.out.println(f2.info());
        System.out.println(f3.info());
    }

}
