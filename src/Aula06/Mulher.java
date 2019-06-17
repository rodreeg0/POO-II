package Aula06;

public class Mulher extends Pessoa implements IPessoa{
	public Mulher(String nome, String sexo) {
		super(nome, sexo);
	}
	public String info() {
		return "Mulher";
	}
}
