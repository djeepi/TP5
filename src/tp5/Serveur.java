package tp5;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Serveur extends Remote {
	public void doIt(int valeur) throws RemoteException;
	public void doiIt(MonObjet objet) throws RemoteException;
	public MonObjet returnIt(MonObjet objet) throws RemoteException;
	public int returnIt(int valeur) throws RemoteException;
}
