package Aula06.AtividadeCarro;

import Aula06.AtividadeFuncionario.*;
import Aula06.*;

public interface ICarro {
	public default String info() {
		return "Generico";
	}
}
