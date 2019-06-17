/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04MVC.ExemplosMVC.Conexao;

import Aula04MVC.ExemplosMVC.Conexao.DTO.Marca;
import Aula04MVC.ExemplosMVC.Conexao.BO.MarcaBO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodriguh
 */
public class MainPesquisarTodos {

    public static void main(String[] args) {
        MarcaBO marcaBO = new MarcaBO();
        List<Marca> lista = new ArrayList<>();
        lista = marcaBO.PesquisarTodos();
        
    }

}
