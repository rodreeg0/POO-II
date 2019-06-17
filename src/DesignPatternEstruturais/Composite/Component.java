/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatternEstruturais.Composite;

/**
 *
 * @author rodriguh
 */
public abstract class Component {
    protected String nome;

    public String getNome() {
        return nome;
    }
    
    public void getPrint(){
        System.out.println(this.nome);
    }
}
