//package example.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;
//Written by Alexis Lyndon Galaura

/**
 * 
 */
public interface Hi extends Remote {
    int countChars(String message) throws RemoteException;
}
