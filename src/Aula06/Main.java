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
public class Main {
    public static void main(String[] args) {
        FactoryPessoa factory = new FactoryPessoa();
        Pessoa p1 = factory.criarPessoa("Rodrigo", "M");
        Pessoa p2 = factory.criarPessoa("joj", "F");
        Pessoa p3 = factory.criarPessoa("XXXX", "");
        System.out.println(p1.info());
        System.out.println(p2.info());
        System.out.println(p3.info());
    }
    
}
