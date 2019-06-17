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
public class Fiesta implements CarroPopular{

    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Fiesta\nFabrica: Ford\n"+"Categoria: Popular");
    }
    
    
}
