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
public class FiestaSedan implements CarroSedan{

    @Override
    public void exibirInfoSedan() {
      System.out.println("Modelo: FiestaSedan\nFabrica: Ford\n"+"Categoria: Sedan");
    }
    
}
