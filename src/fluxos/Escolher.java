package fluxos;
import controle.*;
import paraRicardo.Inicializar;

import java.io.IOException;
import campos.TodosCampos;

public abstract class Escolher implements Inicializar{
	
	public static void iniciar() throws IOException, ClassNotFoundException{
		EntradaSaida.mostrarEnumerado(TodosCampos.campoEscolha());
		EntradaSaida.pegarTestar();
		
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
