package OddEven;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class OddEvenServer {
    public static void main(String[] args) {
        try {
            OddEvenService oddEvenService = new OddEvenServiceImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("OddEvenService", oddEvenService);
            System.out.println("OddEven server Service is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

