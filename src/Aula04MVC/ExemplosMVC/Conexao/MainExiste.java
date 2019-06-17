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
public class MainExiste {
    public static void main(String[] args) {
        //teste existe
        //veriica se existe outro item com a mesma descricao
        MarcaBO marcaBO = new MarcaBO();
        Marca marca = new Marca("LG");
        if(marcaBO.existe(marca))
            System.out.println("Marca encontrada");
        else
            System.out.println("Marca nao encontrada");
    }
}
