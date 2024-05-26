package fluxos;

import java.util.ArrayList;
import java.util.List;

import campos.Formulario;
import campos.TodosCampos;
import controle.Ajudantes;
import controle.EntradaSaida;
import controle.Inicializar;

public abstract class CriarFormulario implements Inicializar{
	
	public static void iniciar() {
		Formulario formulario = new Formulario();
		System.out.println("Preencha os formularios:");
		for(List<String> e : TodosCampos.todosCampos()) {
			perguntar(e);
			formulario.setTodasRespostas(pedir());
		}
	}
	public static void perguntar(List<String> campo) {
		List<String> lista = Ajudantes.enumerar(campo);
		
		System.out.println("----- COMEÇO DO CAMPO -----");
		for(String e : lista) {
			System.out.println(e);
		}
		System.out.println("----- FIM DO CAMPO -----");
	}
	public static List<String> pedir() {
		List<String> lista = new ArrayList<String>();
		System.out.println("Escolha: ");
		EntradaSaida.pegar();
		lista.add(EntradaSaida.getEntradaUsuario());
		return lista;
	}

}
