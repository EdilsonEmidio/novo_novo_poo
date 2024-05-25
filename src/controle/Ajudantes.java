package controle;

import java.util.ArrayList;
import java.util.List;

public abstract class Ajudantes {
	private static List<String> valoresValidos = new ArrayList<String>();
	
	public static List<String> getValoresValidos() {
		return valoresValidos;
	}
	public static void setValoresValidos(String valoresValidos) {
		Ajudantes.valoresValidos.add(valoresValidos);
	}
	
	public static List<String> enumerar(List<String> lista) {
		List<String> novaLista = new ArrayList<String>();
		for(String e : lista) {
			setValoresValidos(Integer.toString(lista.indexOf(e)));
			novaLista.add(lista.indexOf(e)+" - "+e);
		}
		return novaLista;
	}
	public static boolean validarEntrada(String valor) {
		for(String e : getValoresValidos()) {
			if(e.contentEquals(valor)) {
				return true;
			}
		}
		return false;
	}
}
