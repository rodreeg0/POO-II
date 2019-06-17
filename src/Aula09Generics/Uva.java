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
public class Uva {
    private String cor;
    public Uva(String cor){
        setCor(cor);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Uva{" + "cor=" + cor + '}';
    }
    
}
