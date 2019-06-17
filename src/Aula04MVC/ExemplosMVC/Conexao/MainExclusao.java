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
public class MainExclusao {
    public static void main(String[] args) {
        //TesteExcluir
        MarcaBO marcaBO = new MarcaBO();
        Marca marca = new Marca(1);
        if(marcaBO.excluir(marca)){
            System.out.println("excluido com sucesso");
        }else
            System.out.println("Erro ao excluir");
    }
}
