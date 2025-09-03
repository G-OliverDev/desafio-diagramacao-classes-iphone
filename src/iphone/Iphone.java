package iphone;

import iphone.apps.*;

public class Iphone {
	public Ipod ipod;
	public TelefoneApp telefoneApp;
	public Safari safari;
	
	public Iphone() {
		ipod = new Ipod();
		telefoneApp = new TelefoneApp();
		safari = new Safari();
	}
	
}
