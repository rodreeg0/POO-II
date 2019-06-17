package Aula04MVC.ProjetoVendas.DAO;

import java.util.List;

import Aula04MVC.ProjetoVendas.DTO.Cliente;
import Aula04MVC.ProjetoVendas.DTO.ItemVenda;
import Aula04MVC.ProjetoVendas.DTO.LOG;
import Aula04MVC.ProjetoVendas.DTO.Produto;
import Aula04MVC.ProjetoVendas.DTO.Venda;
import Aula04MVC.ProjetoVendas.DTO.Vendedor;

public interface InterfaceDAO<e> {

    public boolean inserir(e f);

    public boolean alterar(e f);

    public boolean excluir(e f);

    public boolean existe(e f);

    public e procurarPorCodigo(e f);

    List<e> pesquisarTodos();

}
