package SI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class InterestClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            InterestService interestService = (InterestService) registry.lookup("InterestService");

            double principal = 1000.0;
            double rate = 5.0;
            int time = 2;
            double interest = interestService.calculateSimpleInterest(principal, rate, time);
            System.out.println("Simple Interest: " + interest);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

