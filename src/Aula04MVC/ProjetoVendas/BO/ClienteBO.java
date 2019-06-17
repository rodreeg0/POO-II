package Aula04MVC.ProjetoVendas.BO;

import Aula04MVC.ProjetoVendas.DTO.Cliente;
import Aula04MVC.ProjetoVendas.DAO.ClienteDAOMySQL;
import java.util.List;
import Aula04MVC.ProjetoVendas.DAO.InterfaceDAO;

/**
 *
 * @author rodriguh
 */
public class ClienteBO {

    InterfaceDAO<Cliente> persistencia;
    
    public ClienteBO(InterfaceDAO persistencia){
        this.persistencia = persistencia;
    }
    
    public boolean inserir(Cliente cliente) {
        if (existe(cliente) != true) {
            ClienteDAOMySQL clienteDAO = new ClienteDAOMySQL();
            return clienteDAO.inserir(cliente);
        }
        return false;
    }

    public boolean alterar(Cliente cliente) {
        ClienteDAOMySQL clienteDAO = new ClienteDAOMySQL();
        return clienteDAO.alterar(cliente);
    }

    public boolean excluir(Cliente cliente) {
        ClienteDAOMySQL clienteDAO = new ClienteDAOMySQL();
        return clienteDAO.excluir(cliente);
    }

    public Cliente procurarPorCodigo(Cliente cliente) {
        ClienteDAOMySQL clienteDAO = new ClienteDAOMySQL();
        return clienteDAO.procurarPorCodigo(cliente);
    }

    public boolean existe(Cliente cliente) {
        ClienteDAOMySQL clienteDAO = new ClienteDAOMySQL();
        return clienteDAO.existe(cliente);
    }

    public List<Cliente> PesquisarTodos() {
        ClienteDAOMySQL clienteDAO = new ClienteDAOMySQL();
        return clienteDAO.pesquisarTodos();
    }
    
    public Cliente procurarPorUsuario(Cliente cliente){
        ClienteDAOMySQL clienteDAO = new ClienteDAOMySQL();
        return clienteDAO.procurarPorUsuario(cliente);
    }
}
