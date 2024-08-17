package SI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class InterestServer {
    public static void main(String[] args) {
        try {
            InterestService interestService = new InterestServiceImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("InterestService", interestService);
            System.out.println("Simple Interest Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

