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
public class PalioPrototype extends CarroPrototype{

    public PalioPrototype(PalioPrototype palioPrototype){
        this.valorCompra = palioPrototype.getValorCompra();
    }
    
    public PalioPrototype (){
        valorCompra = 0.0;
    }
    
    @Override
    public String exibirInfo() {
        return "Modelo: Palio\nMontadora: Fiat\n"
                + "Valor: RS" + getValorCompra();
    }

    @Override
    public PalioPrototype clonar() {
        return new PalioPrototype(this);
    }
    
}
