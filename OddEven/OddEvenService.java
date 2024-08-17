package OddEven;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface OddEvenService extends Remote {
    boolean isOdd(int number) throws RemoteException;
}

