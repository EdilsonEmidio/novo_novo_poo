package fluxos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import campos.Formulario;
import campos.TodosCampos;
import controle.Ajudantes;
import controle.EntradaSaida;
import paraRicardo.Inicializar;

public abstract class CriarFormulario implements Inicializar {
	
	public static void iniciar() throws IOException, ClassNotFoundException {
		Formulario formulario = new Formulario();
		System.out.println("Preencha os formularios:");
		for(List<String> e : TodosCampos.todosCampos()) {
			perguntar(e);
			formulario.setTodasRespostas(pedir());
		}
		salvar(formulario);
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
		EntradaSaida.pegarTestar();
		lista.add(EntradaSaida.getEntradaUsuario());
		return lista;
	}
	public static void salvar(Formulario formulario) throws IOException, ClassNotFoundException  {
		System.out.println("Diga o nome do arquivo:");
		EntradaSaida.pegar();
		String nomeArquivo = (EntradaSaida.getEntradaUsuario()+".txt");
		FileOutputStream arquivoSaida = new FileOutputStream(nomeArquivo);
	    ObjectOutputStream objetoSaida = new ObjectOutputStream(arquivoSaida);

	    objetoSaida.writeObject(formulario);
	    objetoSaida.flush();
	    objetoSaida.close();
	}
	
}
