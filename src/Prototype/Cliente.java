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
public class Cliente {
    public static void main(String[] args) {
        PalioPrototype prototipoPalio = new PalioPrototype();
        CarroPrototype palioNovo = prototipoPalio.clonar();
        palioNovo.setValorCompra(27300.0);
        CarroPrototype palioUsado = prototipoPalio.clonar();
        palioUsado.setValorCompra(15000.0);
        System.out.println(palioNovo.exibirInfo());
        System.out.println(palioUsado.exibirInfo());
    }
}
