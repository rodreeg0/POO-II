/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula07.atividadeFluenteInterface;

/**
 *
 * @author rodriguh
 */
public class main {
    public static void main(String[] args) {
        Conexao conexao = new Conexao().conectarEm("localhost").pelaPorta(8888).usandoUsuario("rodrigo").comSenha("rodrigo");
        System.out.println(conexao);
    }
}
