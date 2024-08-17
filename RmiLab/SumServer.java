package RmiLab;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class SumServer implements SumInterface {

    public SumServer() {}

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    public static void main(String[] args) {
        try {
            // Create an instance of the server
            SumServer server = new SumServer();

            // Export the remote object to the RMI runtime
            SumInterface stub = (SumInterface) UnicastRemoteObject.exportObject(server, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("SumService", stub);

            System.out.println("SumServer is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

