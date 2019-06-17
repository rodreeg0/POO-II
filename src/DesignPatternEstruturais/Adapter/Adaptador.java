/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatternEstruturais.Adapter;

/**
 *
 * @author rodriguh
 */
public class Adaptador implements ITomadaPlana{

    TomadaCircular t;
    
    public Adaptador(){
        t = new TomadaCircular();
    }
    
    @Override
    public void conectar() {
        t.conectarCirculo();
    }
    
}
