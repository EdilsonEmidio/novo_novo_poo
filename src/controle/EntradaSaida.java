package controle;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class EntradaSaida<T> {
	
	private static String entradaUsuario;
	private static Scanner pegador = new Scanner(System.in);
	
	public static String getEntradaUsuario() {
		return entradaUsuario;
	}
	public static void setEntradaUsuario(String entradaUsuario) {
		EntradaSaida.entradaUsuario = entradaUsuario;
	}
	
	public static String pegar() {
		do {
			setEntradaUsuario(pegador.next());
		}while(!Ajudantes.validarEntrada(entradaUsuario));
		
		return getEntradaUsuario();
	}
	public static <T> void mostrar(List<T> lista) {
		for(T e : lista) {
			System.out.println(e);
		}
	}
	public static void mostrarEnumerado(List<String> lista) {
		List<String> novaLista = Ajudantes.enumerar(lista);
		for(String e : novaLista) {
			System.out.println(e);
		}
	}
}
