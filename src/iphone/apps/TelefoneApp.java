package iphone.apps;

import iphone.apps.interfaces.AgendaTelefonica;
import iphone.apps.interfaces.AparelhoTelefonico;

public class TelefoneApp implements AparelhoTelefonico, AgendaTelefonica{

	@Override
	public void ligar(String numero) {
		System.out.println("LIGANDO PARA " + numero);
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO CHAMADA");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}

	@Override
	public void adicionarContato(String nome, String numero) {
		System.out.println("CONTATO " + nome + " CRIADO");
	}

	@Override
	public void removerContato(String nome) {
		System.out.println("CONTATO " + nome + " REMOVIDO");
	}

}
