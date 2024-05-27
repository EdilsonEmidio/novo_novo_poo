package campos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Formulario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private List<List<String>> todasRespostas = new ArrayList<List<String>>();

	public List<List<String>> getTodasRespostas() {
		return todasRespostas;
	}
	public void setTodasRespostas(List<String> todasRespostas) {
		this.todasRespostas.add(todasRespostas);
	}
}
