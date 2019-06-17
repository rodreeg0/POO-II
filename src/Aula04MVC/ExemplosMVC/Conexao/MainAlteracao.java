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
public class MainAlteracao {
    public static void main(String[] args) {
        //Teste alterar
        MarcaBO marcaBO = new MarcaBO();
        Marca marca = new Marca ("Nova marca",1);
        marcaBO.alterar(marca);
        marca = marcaBO.procurarPorCodigo(marca);
        System.out.println(marca);
    }
    
}
