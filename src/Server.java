//package example.hello;
        
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//Written by Alexis Lyndon Galaura

public class Server implements Hi {
        
    public Server() {}

    public int countChars(String message) {
        return message.length();
    }
        
    public static void main(String args[]) {
        
        try {
            Server obj = new Server();
            Hi stub = (Hi) UnicastRemoteObject.exportObject(obj, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Hi", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}