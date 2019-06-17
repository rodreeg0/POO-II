/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author rodriguh
 */
public class GolPrototype extends CarroPrototype{

    public GolPrototype(GolPrototype golPrototype){
        this.valorCompra = golPrototype.getValorCompra();
    }
    
    public GolPrototype (){
        valorCompra = 0.0;
    }
    
    @Override
    public String exibirInfo() {
        return "Modelo: Gol\nMontadora: Volkswagen\n"
                + "Valor: RS" + getValorCompra();
    }

    @Override
    public CarroPrototype clonar() {
        return new GolPrototype(this);
    }
    
}
