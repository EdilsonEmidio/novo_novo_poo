package fluxos;
import controle.*;
import campos.TodosCampos;

public abstract class Escolher implements Inicializar{
	
	public static void iniciar() {
		EntradaSaida.mostrarEnumerado(TodosCampos.campoEscolha());
		EntradaSaida.pegar();
		
		switch(EntradaSaida.getEntradaUsuario()) {
		case "1":
			CriarFormulario.iniciar();
			break;
		case "2":
					
			break;
		case "3":
			
			break;
		case "4":
			
			break;
		}
	}
}
