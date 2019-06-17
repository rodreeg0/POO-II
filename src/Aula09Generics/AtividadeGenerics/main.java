/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula09Generics.AtividadeGenerics;

import Aula09Generics.parametros.Pair;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodriguh
 */
public class main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int num = 5;
        list.add(6);
        list.add(4);
        list.add(7);
        System.out.println(compara.compara(list, num));
    }
}
