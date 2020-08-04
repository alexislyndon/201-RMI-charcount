
import java.rmi.Remote;
import java.rmi.RemoteException;
//Written by Alexis Lyndon Galaura

/**
 * Interface Hi serves as an entry point to use the server methods.
 */
public interface Hi extends Remote {
    int countChars(String message) throws RemoteException;
}
