package fluxos;

import java.util.ArrayList;
import java.util.List;
import campos.TodosCampos;
import controle.Ajudantes;
import controle.EntradaSaida;
import controle.Inicializar;

public abstract class CriarFormulario implements Inicializar{
	
	public static void iniciar() {
		System.out.println("Preencha os formularios:");
		for(List<String> e : TodosCampos.todosCampos()) {
			perguntar(e);
		}
		
	}
	public static void perguntar(List<String> campo) {
		List<String> lista = Ajudantes.enumerar(campo);

		System.out.println("----- COMEÇO DO CAMPO -----");
		for(String e : lista) {
			System.out.println(e);
		}
		System.out.println("Escolha: ");
		System.out.println("----- FIM DO CAMPO -----");
	}

}
