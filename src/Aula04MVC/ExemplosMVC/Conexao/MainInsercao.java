/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04MVC.ExemplosMVC.Conexao;

import Aula04MVC.ExemplosMVC.Conexao.DTO.Marca;
import Aula04MVC.ExemplosMVC.Conexao.BO.MarcaBO;

/**
 *
 * @author rodriguh
 */
public class MainInsercao {

    public static void main(String[] args) {
        //Teste inserir
        MarcaBO marcaBO = new MarcaBO();
        Marca marca = new Marca("Dell");
        if (marcaBO.inserir(marca)) {
            System.err.println("Inserido com sucesso");
        } else {
            System.err.println("Erro ao inserir");
        }
        marca = new Marca("Android");
        if (marcaBO.inserir(marca)) {
            System.err.println("Inserido com sucesso");
        } else {
            System.err.println("Erro ao inserir");
        }
        marca = new Marca("LG   ");
        if (marcaBO.inserir(marca)) {
            System.err.println("Inserido com sucesso");
        } else {
            System.err.println("Erro ao inserir");
        }
    }
}
