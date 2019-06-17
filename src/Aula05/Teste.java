/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05;

/**
 *
 * @author rodriguh
 */
public class Teste {
    private static Teste com;
    
    private Teste(){
        
    }
    
    public static Teste getInstance(){
        if(com == null)
            com = new Teste();
        return com;
    }
}
