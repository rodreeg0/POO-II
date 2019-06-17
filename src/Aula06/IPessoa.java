package Aula06;

public interface IPessoa {
	public default String info() {
		return "Generico";
	}
}
