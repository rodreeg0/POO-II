/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04MVC.ProjetoVendas.persistence;

import java.io.FileNotFoundException;
import java.util.List;
import Aula04MVC.ProjetoVendas.DTO.Cliente;
import Aula04MVC.ProjetoVendas.DTO.Produto;
import Aula04MVC.ProjetoVendas.DTO.Venda;
import Aula04MVC.ProjetoVendas.DTO.Vendedor;

/**
 *
 * @author rodriguh
 */
public class InjecaoDependencia<e> {
    protected Persistencia persistencia;
    
    public InjecaoDependencia(Persistencia persistencia){
        this.persistencia = persistencia;
    }
    
    public List<Vendedor> importar(Vendedor dir)throws FileNotFoundException{
        return this.persistencia.importar(dir);
    }
    
    public List<Venda> importar(Venda p) throws FileNotFoundException{
        return this.persistencia.importar(p);
    }
    public List<Cliente> importar(Cliente p) throws FileNotFoundException{
        return this.persistencia.importar(p);
    }
    public List<Produto> importar(Produto p) throws FileNotFoundException{
        return this.persistencia.importar(p);
    }
    public void exportarVendedor(List<Vendedor> lista){
        this.persistencia.exportar(lista);
    }
    public void exportarProduto(List<Produto> lista){
        this.persistencia.exportar(lista);
    }
    public void exportarVenda(List<Venda> lista){
        this.persistencia.exportar(lista);
    }
    public void exportarCliente(List<Cliente> lista){
        this.persistencia.exportar(lista);
    }
    
}
