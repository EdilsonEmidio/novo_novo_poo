package main;
import campos.TodosCampos;
import controle.Ajudantes;
import controle.EntradaSaida;
import fluxos.Escolher;

public class Main {

	public static void main(String[] args) {
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
			System.out.println("Codigo de erro: " + e.getMessage());
		}finally {
			System.out.println("Deseja tentar novamente?");
			EntradaSaida.mostrarEnumerado(TodosCampos.campoFinally());
			EntradaSaida.pegar();
			
			if(EntradaSaida.getEntradaUsuario().contentEquals("1")) {
				Escolher.iniciar();
			}
			
		}
		

	}

}
