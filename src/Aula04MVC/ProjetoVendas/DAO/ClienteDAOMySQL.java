package Aula04MVC.ProjetoVendas.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Aula04MVC.ProjetoVendas.Conexao.Conexao;
import Aula04MVC.ProjetoVendas.DTO.Cliente;

public class ClienteDAOMySQL implements InterfaceDAO<Cliente> {

    final String NOMEDATABELA = "cliente";

    @Override
    public boolean inserir(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nome, cpf, rg, fone, email, usuario, senha, endereco, numero, bairro, cidade, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getRg());
            ps.setString(4, cliente.getFone());
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
    public boolean alterar(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET nome = ?, cpf = ?, rg = ?, fone = ?, email = ?, usuario = ?,"
                    + " senha = ?, endereco = ?, numero = ?, bairro = ?, cidade = ?, estado = ? WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getRg());
            ps.setString(4, cliente.getFone());
            ps.setString(5, cliente.getEmail());
            ps.setString(6, cliente.getUsuario());
            ps.setString(7, cliente.getSenha());
            ps.setString(8, cliente.getEndereco());
            ps.setInt(9, cliente.getNumero());
            ps.setString(10, cliente.getBairro());
            ps.setString(11, cliente.getCidade());
            ps.setString(12, cliente.getEstado());
            ps.setInt(13, cliente.getIdcliente());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
            return false;
        }
    }

    @Override
    public boolean excluir(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE idcliente = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getIdcliente());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
            return false;
        }
    }

    @Override
    public Cliente procurarPorCodigo(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE idcliente = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getIdcliente());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Cliente obj = new Cliente();
                obj.setIdcliente(rs.getInt(1));
                obj.setNome(rs.getString(2));
                obj.setCpf(rs.getString(3));
                obj.setRg(rs.getString(4));
                obj.setFone(rs.getString(5));
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

    public Cliente procurarPorUsuario(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE usuario = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getUsuario());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Cliente obj = new Cliente();
                obj.setIdcliente(rs.getInt(1));
                obj.setNome(rs.getString(2));
                obj.setCpf(rs.getString(3));
                obj.setRg(rs.getString(4));
                obj.setFone(rs.getString(5));
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
    public boolean existe(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE usuario = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getUsuario());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ps.close();
                rs.close();
                conn.close();
                return true;
            }
        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return false;
        }
        return false;
    }

    @Override
    public List<Cliente> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Cliente> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return null;
        }
    }

    public List<Cliente> montarLista(ResultSet rs) {
        List<Cliente> listObj = new ArrayList<Cliente>();
        try {
            while (rs.next()) {
                Cliente obj = new Cliente();
                obj.setIdcliente(rs.getInt(1));
                obj.setNome(rs.getString(2));
                obj.setCpf(rs.getString(3));
                obj.setRg(rs.getString(4));
                obj.setFone(rs.getString(5));
                obj.setEmail(rs.getString(6));
                obj.setUsuario(rs.getString(7));
                obj.setSenha(rs.getString(8));
                obj.setEndereco(rs.getString(9));
                obj.setNumero(rs.getInt(10));
                obj.setBairro(rs.getString(11));
                obj.setCidade(rs.getString(12));
                obj.setEstado(rs.getString(13));
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
