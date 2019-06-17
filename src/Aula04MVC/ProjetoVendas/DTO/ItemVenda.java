/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04MVC.ProjetoVendas.DTO;

/**
 *
 * @author rodriguh
 */
public class ItemVenda extends Produto {

    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float valorItem() {
        return getValor() * quantidade;
    }

    /**
     * Valor usado por padrão no combobox
     *
     * @return String nome
     */
    @Override
    public String toString() {
        return this.getDescricao();
    }

}
