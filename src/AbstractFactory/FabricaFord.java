/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author rodriguh
 */
public class FabricaFord implements FabricaDeCarro {
    

    @Override
    public CarroSedan criarCarroSedan() {
        return new FiestaSedan();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Fiesta();
    }
    
}

