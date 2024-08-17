package PrimeNumber;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class PrimeClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1098);
            PrimeService primeService = (PrimeService) registry.lookup("PrimeService");

            int number = 29;
            boolean isPrime = primeService.isPrime(number);
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is a composite number.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

