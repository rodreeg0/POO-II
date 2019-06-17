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
public class Siena implements CarroSedan{

    @Override
    public void exibirInfoSedan() {
         System.out.println("Modelo: Siena\nFabrica: Fiat\n"+"Categoria: Sedan");
    }
    
}
