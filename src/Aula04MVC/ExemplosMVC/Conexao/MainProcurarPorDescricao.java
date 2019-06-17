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
public class MainProcurarPorDescricao {
    public static void main(String[] args) {
        //retorna o primeiro encontrado
        MarcaBO marcaBO = new MarcaBO();
        Marca marca = new Marca("Android");
        marca = marcaBO.procurarPorDescricao(marca);
        System.out.println(marca);
    }
}
