package SI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterestService extends Remote {
    double calculateSimpleInterest(double principal, double rate, int time) throws RemoteException;
}

