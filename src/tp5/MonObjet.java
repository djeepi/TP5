package tp5;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MonObjet implements Serializable{

	private int a;
	
	public MonObjet() {
		this.a = 20;
	}
	
	public int getValeur() {
		return a;
	}
	
}
