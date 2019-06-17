package Aula04MVC.ProjetoVendas.persistence;

import java.util.List;

import Aula04MVC.ProjetoVendas.DTO.Cliente;
import Aula04MVC.ProjetoVendas.DTO.ItemVenda;
import Aula04MVC.ProjetoVendas.DTO.LOG;
import Aula04MVC.ProjetoVendas.DTO.Produto;
import Aula04MVC.ProjetoVendas.DTO.Venda;
import Aula04MVC.ProjetoVendas.DTO.Vendedor;
import Aula04MVC.ProjetoVendas.DAO.InterfaceDAO;

public class InjecaoSql {

	protected InterfaceDAO metodos;

	public InjecaoSql(InterfaceDAO metodos) {
		this.metodos = metodos;
	}

	public boolean inserir(Produto p) {
		if (existeProduto(p.getDescricao()) != true) {
			return this.metodos.inserir(p);
		}
		return false;
	}

	public boolean inserir(Cliente p) {
		if (existeCliente(p.getUsuario()) != true) {
			if (existeVendedor(p.getUsuario()) != true) {
				return this.metodos.inserir(p);
			}
		}
		return false;
	}

	public boolean inserir(LOG p) {
		return this.metodos.inserir(p);
	}

	public boolean inserir(ItemVenda p) {
		return this.metodos.inserir(p);
	}

	public boolean inserir(Vendedor p) {
		if (existeCliente(p.getUsuario()) != true) {
			if (existeVendedor(p.getUsuario()) != true) {
				return this.metodos.inserir(p);
			}
		}
		return false;
	}

	public boolean inserir(Venda p) {
		return this.metodos.inserir(p);
	}

	public boolean alterar(Produto p) {
		return this.metodos.alterar(p);
	}

	public boolean alterar(Venda p) {
		return this.metodos.alterar(p);
	}

	public boolean alterar(ItemVenda p) {
		return this.metodos.alterar(p);
	}

	public boolean alterar(Cliente p) {
		return this.metodos.alterar(p);
	}

	public boolean alterar(Vendedor p) {
		return this.metodos.alterar(p);
	}

	public boolean alterar(LOG p) {
		return this.metodos.alterar(p);
	}

	public boolean excluir(Produto p) {
		return this.metodos.excluir(p);
	}

	public boolean excluir(LOG p) {
		return this.metodos.excluir(p);
	}

	public boolean excluir(Cliente p) {
		return this.metodos.excluir(p);
	}

	public boolean excluir(ItemVenda p) {
		return this.metodos.excluir(p);
	}

	public boolean excluir(Venda p) {
		return this.metodos.excluir(p);
	}

	public boolean excluir(Vendedor p) {
		return this.metodos.excluir(p);
	}
/*
	public Cliente procurarUsuarioCliente(String p) {
		return this.metodos.procurarUsuarioCliente(p);
	}

	public Vendedor procurarUsuarioVendedor(String p) {
		return this.metodos.procurarUsuarioVendedor(p);
	}

	public Cliente procurarCodigoCliente(int p) {
		return this.metodos.procurarCodigo(p);
	}

	public Vendedor procurarCodigoVendedor(int p) {
		return this.metodos.procurarCodigoVendedor(p);
	}

	public Venda procurarCodigoVenda(int p) {
		return this.metodos.procurarCodigoVenda(p);
	}

	public Produto procurarCodigoProduto(int p) {
		return this.metodos.procurarCodigoProduto(p);
	}

	public LOG procurarCodigoLog(int p) {
		return this.metodos.procurarCodigoLog(p);
	}

	public boolean existeVendedor(String p) {
		return this.metodos.existeVendedor(p);
	}

	public boolean existeCliente(String p) {
		return this.metodos.existeCliente(p);
	}

	public boolean existeProduto(String p) {
		return this.metodos.existeProduto(p);
	}
	
	
	public boolean existeCpf(String p) {
		return this.metodos.existeCpf(p);
	}
	public boolean existeRg(String p) {
		return this.metodos.existeRg(p);
	}
	public boolean existeEmail(String p) {
		return this.metodos.existeEmail(p);
	}
	
	public List<Produto> PesquisarTodosProduto(List<Produto> lista){
		return this.metodos.PesquisarTodosProduto(lista);
	}
	
	public List<ItemVenda> PesquisarTodosItemVenda(List<ItemVenda> lista){
		return this.metodos.PesquisarTodosItemVenda(lista);
	}
*/
}
