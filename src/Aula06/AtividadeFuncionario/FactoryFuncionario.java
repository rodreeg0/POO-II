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
public class FactoryFuncionario implements IFactoryFuncionario{
    @Override
    public Funcionario criarPessoa(String nome, String cargo) {
        if ("ENGENHEIRO".equalsIgnoreCase(cargo)) {
            FactoryEngenheiro fp = new FactoryEngenheiro();
            return fp.criarPessoa(nome, cargo);
        } else if ("MECANICO".equalsIgnoreCase(cargo)) {
            FactoryMecanico fd = new FactoryMecanico();
            return fd.criarPessoa(nome, cargo);
        } else if("ARQUITETO".equalsIgnoreCase(cargo)){
            FactoryArquiteto fd = new FactoryArquiteto();
            return fd.criarPessoa(nome, cargo);
            
        }else
            return new Funcionario(nome, cargo);
    }
}
