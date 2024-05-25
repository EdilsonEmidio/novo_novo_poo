package campos;
import java.util.ArrayList;
import java.util.List;

import controle.Ajudantes;

public abstract class TodosCampos{
	
	public static List<String> campoFinally(){
		List<String> lista = new ArrayList<String>();
		lista.add("sair");
		lista.add("Voltar");
		return lista;
	}
	
	public static List<String> campoEscolha() {
		List<String> lista = new ArrayList<String>();
		lista.add("sair");
		lista.add("Criar");
		lista.add("Ler");
		lista.add("Atualizar");
		lista.add("Deletar");
		return lista;
	}
	//começa daqui o formulario
	public static List<String> campoModalidade(){
		List<String> lista = new ArrayList<String>();
		lista.add("Programa");
		lista.add("Projeto");
		lista.add("Núcleo Temático");
		lista.add("Evento");
		lista.add("Empresa Junior");
		lista.add("Liga Acadêmica");
		lista.add("Prestação de Serviço");
		lista.add("Curso");
		lista.add("Outro");
		return lista;
	}
	public static List<List<String>> todosCampos(){
		List<List<String>> lista = new ArrayList<List<String>>();
		lista.add(campoModalidade());
		return lista;
	}
}
