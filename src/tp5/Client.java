package tp5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
	public static void main(String[] args){
		try {
			//Serveur monServeur = (Serveur) Naming.lookup("rmi://localhost:1099/ServeurRmi");
			Serveur monServeur = (Serveur) Naming.lookup("rmi://localhost/ServeurRmi");
			monServeur.doiIt(new MonObjet());
			monServeur.doIt(12);
			System.out.println(monServeur.returnIt(40));
			System.out.println(monServeur.returnIt(new MonObjet().getValeur()));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
