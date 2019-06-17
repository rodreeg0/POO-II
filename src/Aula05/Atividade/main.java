/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05.Atividade;

/**
 *
 * @author rodriguh
 */
public class main {
    public static void main(String[] args) {
        Conexao c = Conexao.getInstance();
        c.conectar();
        System.out.println(c);
    }
}
