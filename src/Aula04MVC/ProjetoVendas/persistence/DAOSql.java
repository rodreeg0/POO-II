package Aula04MVC.ProjetoVendas.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import Aula04MVC.ProjetoVendas.Conexao.Conexao;
import Aula04MVC.ProjetoVendas.DTO.Cliente;
import Aula04MVC.ProjetoVendas.DTO.ItemVenda;
import Aula04MVC.ProjetoVendas.DTO.LOG;
import Aula04MVC.ProjetoVendas.DTO.Produto;
import Aula04MVC.ProjetoVendas.DTO.Venda;
import Aula04MVC.ProjetoVendas.DTO.Vendedor;
import Aula04MVC.ProjetoVendas.DAO.InterfaceDAO;

public class DAOSql implements InterfaceDAO {
	
	SimpleDateFormat dh = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public boolean inserir(ItemVenda itemVenda) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + "ItemVenda" + " (idproduto, idvenda, iditemvenda, descricao, valor) VALUES (? ,? ,? ,? ,?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, itemVenda.getIdProduto());
			ps.setInt(2, itemVenda.getIdvenda());
			ps.setInt(3, itemVenda.getIdItemVenda());
			ps.setString(4, itemVenda.getDescricao());
			ps.setFloat(5, itemVenda.getValor());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean inserir(Cliente cliente) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + "Cliente"
					+ " (Nome, Cpf, Rg, Telefone, Email, Usuario, Senha, Endereco, Numero, Bairro, Cidade, Estado) VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCpf());
			ps.setString(3, cliente.getRg());
			ps.setString(4, cliente.getTelefone());
			ps.setString(5, cliente.getEmail());
			ps.setString(6, cliente.getUsuario());
			ps.setString(7, cliente.getSenha());
			ps.setString(8, cliente.getEndereco());
			ps.setInt(9, cliente.getNumero());
			ps.setString(10, cliente.getBairro());
			ps.setString(11, cliente.getCidade());
			ps.setString(12, cliente.getEstado());

			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean inserir(LOG log) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + "Log" + " (descricao) VALUES (?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, log.getDesc());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean inserir(Produto produto) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + "Produto" + " (Descricao, Valor, Estoque) VALUES (?,?,?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, produto.getDescricao());
			ps.setFloat(2, produto.getValor());
			ps.setInt(3, produto.getEstoque());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean inserir(Vendedor vendedor) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + "Vendedor" + " (Nome, Usuario, Senha) VALUES (?,?,?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vendedor.getNome());
			ps.setString(2, vendedor.getUsuario());
			ps.setString(3, vendedor.getSenha());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean inserir(Venda venda) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "INSERT INTO " + "Venda" + " (Data, idCliente, DataVencimento, DataPagamento, idVendedor) VALUES (?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, dh.format(venda.getData()));
			ps.setInt(2, venda.getIdCliente());
			ps.setString(3, dh.format(venda.getDataVencimento()));
			ps.setString(4, dh.format(venda.getDataPagamento()));
			ps.setInt(5, venda.getIdVendedor());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean alterar(ItemVenda Itemvenda) {
		return false;
	}

	@Override
	public boolean alterar(Cliente cliente) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "UPDATE " + "Cliente"
					+ " SET Nome = ?, Cpf = ?, Rg = ?, Telefone= ?, Email = ?, Usuario = ?, Senha= ?, Endereco = ?, Numero = ?, Bairro= ?, Cidade = ?, Estado = ? WHERE ID = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCpf());
			ps.setString(3, cliente.getRg());
			ps.setString(4, cliente.getTelefone());
			ps.setString(5, cliente.getEmail());
			ps.setString(6, cliente.getUsuario());
			ps.setString(7, cliente.getSenha());
			ps.setString(8, cliente.getEndereco());
			ps.setInt(9, cliente.getNumero());
			ps.setString(10, cliente.getBairro());
			ps.setString(11, cliente.getCidade());
			ps.setString(12, cliente.getEstado());
			ps.setInt(13, cliente.getIdentidade());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean alterar(LOG log) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar(Produto produto) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "UPDATE " + "Produto" + " SET Descricao = ?, Valor = ?, Estoque = ? WHERE idProduto = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, produto.getDescricao());
			ps.setFloat(2, produto.getValor());
			ps.setInt(3, produto.getEstoque());
			ps.setInt(4, produto.getIdProduto());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean alterar(Vendedor vendedor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar(Venda venda) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(ItemVenda Itemvenda) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(LOG log) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(Produto produto) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "DELETE FROM " + "Produto" + " WHERE idProduto = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, produto.getIdProduto());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean excluir(Vendedor vendedor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(Venda venda) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cliente procurarCodigo(int p) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + "Cliente" + " WHERE ID = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, p);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				Cliente obj = new Cliente();
				obj.setIdentidade(rs.getInt(1));
				obj.setNome(rs.getString(2));
				obj.setCpf(rs.getString(3));
				obj.setRg(rs.getString(4));
				obj.setTelefone(rs.getString(5));
				obj.setEmail(rs.getString(6));
				obj.setUsuario(rs.getString(7));
				obj.setSenha(rs.getString(8));
				obj.setEndereco(rs.getString(9));
				obj.setNumero(rs.getInt(10));
				obj.setBairro(rs.getString(11));
				obj.setCidade(rs.getString(12));
				obj.setEstado(rs.getString(13));
				
				ps.close();
				rs.close();
				conn.close();
				return obj;
			} else {
				ps.close();
				rs.close();
				conn.close();
				return null;
			}
		}catch (Exception e) {
			return null;
				
			
		}
	}

	@Override
	public Venda procurarCodigoVenda(int p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vendedor procurarCodigoVendedor(int p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LOG procurarCodigoLog(int p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto procurarCodigoProduto(int p) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + "Produto" + " WHERE idProduto = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, p);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				Produto obj = new Produto();
				obj.setIdProduto(rs.getInt(1));
				obj.setDescricao(rs.getString(2));
				obj.setValor(rs.getFloat(3));
				obj.setEstoque(rs.getInt(4));
				ps.close();
				rs.close();
				conn.close();
				return obj;
			} else {
				ps.close();
				rs.close();
				conn.close();
				return null;
			}
		}catch (Exception e) {
			return null;
				
			
		}
	}

	@Override
	public Cliente procurarUsuarioCliente(String p) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + "Cliente" + " WHERE usuario = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				
				Cliente obj = new Cliente();
				obj.setIdentidade(rs.getInt(1));
				obj.setNome(rs.getString(2));
				obj.setCpf(rs.getString(3));
				obj.setRg(rs.getString(4));
				obj.setTelefone(rs.getString(5));
				obj.setEmail(rs.getString(6));
				obj.setUsuario(rs.getString(7));
				obj.setSenha(rs.getString(8));
				obj.setEndereco(rs.getString(9));
				obj.setNumero(rs.getInt(10));
				obj.setBairro(rs.getString(11));
				obj.setCidade(rs.getString(12));
				obj.setEstado(rs.getString(13));
				ps.close();
				rs.close();
				conn.close();
				return obj;
			} else {
				ps.close();
				rs.close();
				conn.close();
				return null;
			}
		} catch (Exception e) {
			return null;

		}
	}

	@Override
	public Vendedor procurarUsuarioVendedor(String p) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + "Vendedor" + " WHERE usuario = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				
				Vendedor obj = new Vendedor();
				obj.setIdentidade(rs.getInt(1));
				obj.setNome(rs.getString(2));
				obj.setUsuario(rs.getString(3));
				obj.setSenha(rs.getString(4));
				ps.close();
				rs.close();
				conn.close();
				return obj;
			} else {
				ps.close();
				rs.close();
				conn.close();
				return null;
			}
		} catch (Exception e) {
			return null;

		}
	}

	@Override
	public boolean existeVendedor(String p) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + "Vendedor" + " WHERE usuario = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				ps.close();
				rs.close();
				conn.close();
				return true;
			}
		}catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return false;
			
		}
		return false;
	}

	@Override
	public boolean existeCliente(String p) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + "Cliente" + " WHERE usuario = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				ps.close();
				rs.close();
				conn.close();
				return true;
			}
		}catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return false;
			
		}
		return false;
	}
	
	@Override
	public boolean existeCpf(String p) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + "Cliente" + " WHERE Cpf = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				ps.close();
				rs.close();
				conn.close();
				return true;
			}
		}catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return false;
			
		}
		return false;
	}

	@Override
	public boolean existeEmail(String p) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + "Cliente" + " WHERE Email = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				ps.close();
				rs.close();
				conn.close();
				return true;
			}
		}catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return false;
			
		}
		return false;
	}

	@Override
	public boolean existeRg(String p) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + "Cliente" + " WHERE Rg = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				ps.close();
				rs.close();
				conn.close();
				return true;
			}
		}catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return false;
			
		}
		return false;
	}

	

	@Override
	public boolean existeProduto(String p) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + "Produto" + " WHERE Descricao = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				ps.close();
				rs.close();
				conn.close();
				return true;
			}
		}catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return false;
			
		}
		return false;
	}

	@Override
	public List<Produto> PesquisarTodosProduto(List<Produto> lista) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + "Produto" + ";";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Produto> listObj = montarListaProduto(rs);
			return listObj;
		}catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return null;
		}
	}
	public List<Produto> montarListaProduto(ResultSet rs){
		List<Produto> listObj = new ArrayList<Produto>();
		try {
			while(rs.next()) {
				Produto obj = new Produto();
				obj.setIdProduto(rs.getInt(1));
				obj.setDescricao(rs.getString(2));
				obj.setValor(rs.getFloat(3));
				obj.setEstoque(rs.getInt(4));
				listObj.add(obj);
			}
			return listObj;
		} catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public List<ItemVenda> PesquisarTodosItemVenda(List<ItemVenda> lista) {
		try {
			Connection conn = Conexao.conectar();
			String sql = "SELECT * FROM " + "ItemVenda" + ";";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<ItemVenda> listObj = montarListaItemVenda(rs);
			return listObj;
		}catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return null;
		}
	}
	public List<ItemVenda> montarListaItemVenda(ResultSet rs){
		List<ItemVenda> listObj = new ArrayList<ItemVenda>();
		try {
			while(rs.next()) {
				ItemVenda obj = new ItemVenda();
				obj.setIdProduto(rs.getInt(1));
				obj.setIdvenda(rs.getInt(2));
				obj.setDescricao(rs.getString(3));
				obj.setQuantidade(rs.getInt(4));
				obj.setValor(rs.getFloat(5));
				listObj.add(obj);
			}
			return listObj;
		} catch (Exception e) {
			System.err.println("Erro: " + e.toString());
			e.printStackTrace();
			return null;
		}
		
	}

}
