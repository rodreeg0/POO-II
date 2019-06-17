/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05.ProblemaAluno;

/**
 *
 * @author rodriguh
 */
public class Main {
    public static void main(String[] args) {
        FabricaDeAluno fabrica = new FabricaAlunoInformatica();
        Aluno aluno = fabrica.criarAluno();
        System.out.println(aluno.exibirInfo());
        
        fabrica = new FabricaAlunoEletronica();
        aluno = fabrica.criarAluno();
        System.out.println(aluno.exibirInfo());
        
        fabrica = new FabricaAlunoMecatronica();
        aluno = fabrica.criarAluno();
        System.out.println(aluno.exibirInfo());
    }
}
