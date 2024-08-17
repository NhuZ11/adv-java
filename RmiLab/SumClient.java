package RmiLab;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SumClient {

    public static void main(String[] args) {
        try {
            // Get the registry
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Look up the remote object
            SumInterface stub = (SumInterface) registry.lookup("SumService");

            // Call the remote method
            int result = stub.add(100, 50);

            System.out.println("Sum of 5 and 10 is: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

