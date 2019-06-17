/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04MVC.ProjetoVendas.DTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author rodriguh
 */
public class Venda {
    private int id_venda;
    private Date data;
    private Date dataVencimento;
    private Date dataPagamento;
    
    protected Cliente cliente;
    protected Vendedor vendedor;
    private List<ItemVenda> produtos;

    public Venda(){
        produtos = new ArrayList<>();
    }
    
    public float valorVenda(){
        float a = 0;
        for(ItemVenda v : produtos){
            a += v.getQuantidade() * v.getValor();
        }
        return a;
    }
    
    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public List<ItemVenda> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ItemVenda> produtos) {
        this.produtos = produtos;
    }

    public int getId_venda() {
        return id_venda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    /**
     * Valor usado por padrão no combobox
     *
     * @return String nome
     */
    @Override
    public String toString() {
        return String.valueOf(this.getId_venda());
    }
}
