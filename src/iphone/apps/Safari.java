package iphone.apps;

import iphone.apps.interfaces.NavegadorInternet;

public class Safari implements NavegadorInternet {

	@Override
	public void exibirPagina(String url) {
		System.out.println("ACESSANDO " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("NOVA ABA ADICIONADA");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA");
	}

}
