/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula09Generics;

/**
 *
 * @author rodriguh
 */
public class Banana {
    private String tipo;
    private String origem;
    
    public Banana(){
        
    }
    
    public Banana(String tipo, String origem){
        this.setTipo(tipo);
        this.setOrigem(origem);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    @Override
    public String toString() {
        return "Banana{" + "tipo=" + tipo + ", origem=" + origem + '}';
    }
    
    
}
