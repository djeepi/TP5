package tp5;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class ServeurRmi extends UnicastRemoteObject implements Serveur{

	public ServeurRmi() throws RemoteException {
		super();
	}

	@Override
	public void doIt(int valeur) throws RemoteException {
		System.out.println(valeur);
		
	}

	@Override
	public void doiIt(MonObjet objet) throws RemoteException {
		System.out.println(objet.getValeur());
	}
	
	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099).bind("ServeurRmi", new ServeurRmi());
//			Naming.bind("rmi://localhost/ServeurRmi", new ServeurRmi());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public MonObjet returnIt(MonObjet objet) throws RemoteException {
		return objet;
	}

	@Override
	public int returnIt(int valeur) throws RemoteException {
		return valeur;
	}

}
