/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04MVC.ExemplosMVC.Conexao.DTO;

/**
 *
 * @author rodriguh
 */
public class Marca {
    int codigo;
    String descricao;
    
    public Marca(){
        
    }
    
    public Marca(int codigo){
        this.setCodigo(codigo);
    }
    
    public Marca(String descricao){
        this.setDescricao(descricao);
    }
    
    public Marca(String descricao, int codigo){
        this.setCodigo(codigo);
        this.setDescricao(descricao);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
