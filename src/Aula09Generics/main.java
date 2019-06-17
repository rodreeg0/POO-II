/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula09Generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodriguh
 */
public class main {
    public static void main(String[] args) {
        List<Banana> list = new ArrayList<>();
        Banana b = new Banana("Branca","Brasileira");
        list.add(b);
        Banana c = list.get(0);
        System.out.println(c.toString());
    }
}
