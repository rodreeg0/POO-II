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
public class JUnitTeste1 extends TestCase {
    
    Operacao op = new Operacao();
    public void testAdiciona1() {
        assertEquals(8.0, op.adicao(6, 2));
    }
    
    public void testAdiciona2() {
        assertEquals(2.0, op.adicao(1, 1));
    }
    
    public void testMultiplicacao1 () {
        assertEquals(2.0, op.multiplicacao(2, 1));
    }
    
    public void testMultiplicacao2 () {
        assertEquals(6.0, op.multiplicacao(3, 2));
    }
    
    public void testDivisao1() {
        assertEquals(2.0, op.divisao(4, 2));
    }
    
    public void Divisao2() {
        assertEquals(3.0, op.divisao(6, 2));
    }
    public void testDivisao3 () {
        assertEquals(2.0, op.divisao(12, 6));
    }
}
