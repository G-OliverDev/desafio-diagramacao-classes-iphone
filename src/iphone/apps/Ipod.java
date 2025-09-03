package iphone.apps;

import iphone.apps.interfaces.ReprodutorMusical;
import iphone.apps.interfaces.ReprodutorVideo;

public class Ipod implements ReprodutorMusical, ReprodutorVideo {

	@Override
	public void tocar() {
		System.out.println("TOCANDO MÚSICA");
	}

	@Override
	public void pausar() {
		System.out.println("MÚSICA PAUSADA");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println(musica + " SELECIONADA");
	}

	@Override
	public void reproduzir() {
		System.out.println("REPRODUZINDO VÍDEO");
	}
	
	@Override
	public void pausarVideo() {
		System.out.println("VÍDEO PAUSADO");
	}

	@Override
	public void selecionarVideo(String video) {
		System.out.println(video + " SELECIONADO");
	}

}
