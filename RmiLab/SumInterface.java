package RmiLab;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SumInterface extends Remote {
    int add(int a, int b) throws RemoteException;
}

