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
public class TomadaCircular implements ITomadaCircular {

    @Override
    public void conectarCirculo() {
        System.out.println("Conectada Circular");
    }
    
}
