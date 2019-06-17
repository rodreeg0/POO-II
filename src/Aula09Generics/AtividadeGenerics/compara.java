/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula09Generics.AtividadeGenerics;

import java.util.List;

/**
 *
 * @author rodriguh
 * @param <T>
 */
public class compara {
    public static <T extends Comparable<T>> int compara(List<T> list, T a){
        int cont = 0;
        for(T b: list){
            if(b.compareTo(a) > 0)
                cont++;
        }
        return cont;
    }
}
