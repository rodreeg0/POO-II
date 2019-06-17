/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula06.AtividadeFuncionario;

/**
 *
 * @author rodriguh
 */
public class Arquiteto extends Funcionario{
    public Arquiteto(String nome, String sexo) {
		super(nome, sexo);
	}
	public String info() {
		return "Arquiteto";
	}
}
