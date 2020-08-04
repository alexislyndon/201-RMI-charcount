//git spackage example.hello;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
//Written by Alexis Lyndon Galaura
public class Client {

    private Client() {}

    
    /** 
     * @param args
     * Client-side user interface asks for input(Command Line) and sends the input as a message and receives the response.
     */
    public static void main(String[] args) {

        String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            Hi stub = (Hi) registry.lookup("Hi");
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter message: ");
            String message = sc.nextLine();
            int response = stub.countChars(message);
            sc.close();
            System.out.println("Number of characters: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}