/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Aula08BateriaTestes.Operacao;

import junit.framework.TestCase;

/**
 *
 * @author rodriguh
 */
public class ExJUnit extends TestCase {

    Operacao op = new Operacao();

    public void testAdicao() {
        assertEquals(4.0, op.adicao(2, 2), 0);
    }

    public void testMultiplicacao() {
        assertEquals(4.0, op.multiplicacao(2, 2), 0);
    }

    public void testDivisao() {
        assertEquals(4.0, op.divisao(8, 2), 0);
    }

}
