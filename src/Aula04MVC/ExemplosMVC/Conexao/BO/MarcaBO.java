/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04MVC.ExemplosMVC.Conexao.BO;

import Aula04MVC.ExemplosMVC.Conexao.DAO.MarcaDAO;
import Aula04MVC.ExemplosMVC.Conexao.DTO.Marca;
import java.util.List;

/**
 *
 * @author rodriguh
 */
public class MarcaBO {

    public boolean inserir(Marca marca) {
        if (existe(marca) != true) {
            MarcaDAO marcasDAO = new MarcaDAO();
            return marcasDAO.inserir(marca);
        }
        return false;
    }

    public boolean alterar(Marca marca) {
        MarcaDAO marcasDAO = new MarcaDAO();
        return marcasDAO.alterar(marca);
    }

    public boolean excluir(Marca marca) {
        MarcaDAO marcasDAO = new MarcaDAO();
        return marcasDAO.excluir(marca);
    }
    public Marca procurarPorCodigo(Marca marca){
        MarcaDAO marcasDAO = new MarcaDAO();
        return marcasDAO.procurarPorCodigo(marca);
    }
    public Marca procurarPorDescricao(Marca marca){
        MarcaDAO marcasDAO = new MarcaDAO();
        return marcasDAO.procurarPorDescricao(marca);
    }
    public boolean existe(Marca marca){
        MarcaDAO marcasDAO = new MarcaDAO();
        return marcasDAO.existe(marca);
    }
    public List<Marca> PesquisarTodos(){
        MarcaDAO marcasDAO = new MarcaDAO();
        return marcasDAO.pesquisarTodos();
    }
}
