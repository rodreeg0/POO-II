package Aula06.AtividadeFuncionario;

import Aula06.*;

public interface IFuncionario {
	public default String info() {
		return "Generico";
	}
}
