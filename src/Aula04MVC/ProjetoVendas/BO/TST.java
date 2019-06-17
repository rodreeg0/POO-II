/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04MVC.ProjetoVendas.BO;

import Aula04MVC.ProjetoVendas.DAO.ClienteDAOMySQL;
import Aula04MVC.ProjetoVendas.DAO.InterfaceDAO;
import Aula04MVC.ProjetoVendas.DTO.Cliente;
import java.util.List;

/**
 *
 * @author rodriguh
 */
public class TST {
    public static void main(String[] args) {
        InterfaceDAO<Cliente> i = new ClienteDAOMySQL();
        ClienteBO  cb = new ClienteBO(i);
        List<Cliente> b = cb.PesquisarTodos();
        System.out.println(b.size());
    }
}
