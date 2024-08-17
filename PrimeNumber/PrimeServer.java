package PrimeNumber;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class PrimeServer {
    public static void main(String[] args) {
        try {
            PrimeService primeService = new PrimeServiceImpl();
            Registry registry = LocateRegistry.createRegistry(1098);
            registry.rebind("PrimeService", primeService);
            System.out.println("Prime Number Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

