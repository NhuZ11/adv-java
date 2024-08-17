package OddEven;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class OddEvenClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            OddEvenService oddEvenService = (OddEvenService) registry.lookup("OddEvenService");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any number");
            int num=sc.nextInt();
            int number = num;
            boolean isOdd = oddEvenService.isOdd(number);
            if (isOdd) {
                System.out.println(number + " is odd.");
            } else {
                System.out.println(number + " is even.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

