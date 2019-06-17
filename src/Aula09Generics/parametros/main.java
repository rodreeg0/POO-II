/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula09Generics.parametros;

/**
 *
 * @author rodriguh
 */
public class main {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "rodrigo");
        Pair<Integer, String> p2 = new Pair<>(1, "rodrigo");
        boolean same = Util.<Integer, String>compare(p1, p2);
        System.out.println(same);
    }
}
