package main;
import java.io.IOException;

import campos.TodosCampos;
import controle.EntradaSaida;
import fluxos.Escolher;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try {
			boolean manter = true;
			do {
				Escolher.iniciar();
				if(EntradaSaida.getEntradaUsuario().contentEquals("0")) {
					manter = false;
				}
			}while(manter);	
			
		}catch(Exception e) {
			System.out.println("Erro!");
			System.out.println("Codigo de erro: " + e);
		}finally {
			System.out.println("Deseja tentar novamente?");
			EntradaSaida.mostrarEnumerado(TodosCampos.campoFinally());
			EntradaSaida.pegarTestar();
			
			if(EntradaSaida.getEntradaUsuario().contentEquals("1")) {
				Escolher.iniciar();
			}
			
		}	
	}

}
