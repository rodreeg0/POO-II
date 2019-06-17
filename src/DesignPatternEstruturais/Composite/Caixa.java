/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatternEstruturais.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodriguh
 */
public class Caixa extends Component{
    protected List<Component> lista;
    
    public Caixa(){
        
    }
    
    public Caixa(String nome){
        this.nome = nome;
        this.lista = new ArrayList<>();
    }
    
    public void add(Component c){
        this.lista.add(c);
    }
    
    public void remove(Component c){
        lista.remove(c);
    }
    
    public Component getChild(int filho){
        return lista.get(filho);
    }
    
    public List<Component> getChildren(){
        return this.lista;
    }
    
    @Override
    public void getPrint(){
        System.out.println(this.nome);
        for(Component l:lista){
            l.getPrint();
        }
    }
}
