/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08BateriaTestes;

/**
 *
 * @author rodriguh
 */
public class Operacao {
    public double adicao(double n1, double n2){
        return n1 + n2;
    }
    public double multiplicacao(double n1, double n2){
        return n1 * n2;
    }
    public double subtracao(double n1, double n2){
        return n1 - n2;
    }
    public double divisao(double n1, double n2){
        System.out.println(n1/n2);
        return n1 / n2;
    }
}
