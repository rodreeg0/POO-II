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
public class FiestaPrototype extends CarroPrototype{

    public FiestaPrototype(FiestaPrototype fiestaPrototype){
        this.valorCompra = fiestaPrototype.getValorCompra();
    }
    
    public FiestaPrototype(){
        valorCompra = 0.0;
    }
    
    @Override
    public String exibirInfo() {
        return "Modelo: Fiesta\nMontadora: Ford\n"
                + "Valor: RS" + getValorCompra();
    }

    @Override
    public CarroPrototype clonar() {
        return new FiestaPrototype(this);
    }
    
}
