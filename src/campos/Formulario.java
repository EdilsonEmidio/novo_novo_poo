package campos;

import java.util.ArrayList;
import java.util.List;

public class Formulario {
	private List<List<String>> todasRespostas = new ArrayList<List<String>>();

	public List<List<String>> getTodasRespostas() {
		return todasRespostas;
	}
	public void setTodasRespostas(List<String> todasRespostas) {
		this.todasRespostas.add(todasRespostas);
	}
}
