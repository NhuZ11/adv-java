package PrimeNumber;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class PrimeServiceImpl extends UnicastRemoteObject implements PrimeService {

    protected PrimeServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public boolean isPrime(int number) throws RemoteException {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

