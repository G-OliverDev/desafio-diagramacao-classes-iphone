import iphone.Iphone;

public class Main {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		// Ipod
		iphone.ipod.selecionarMusica("With a Little Help From My Friends");
		iphone.ipod.tocar();
		iphone.ipod.pausar();
		
		iphone.ipod.selecionarVideo("Piratas do Caribe");
		iphone.ipod.reproduzir();
		iphone.ipod.pausarVideo();
		
		// TelefoneApp
		iphone.telefoneApp.ligar("4002 8922");
		iphone.telefoneApp.atender();
		iphone.telefoneApp.iniciarCorreioVoz();
		
		iphone.telefoneApp.adicionarContato("João", "9898 8989");
		iphone.telefoneApp.removerContato("Pedro");
		
		// Safari
		iphone.safari.exibirPagina("www.google.com");
		iphone.safari.atualizarPagina();
		iphone.safari.adicionarNovaAba();
	}

}
