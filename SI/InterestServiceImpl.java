package SI;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class InterestServiceImpl extends UnicastRemoteObject implements InterestService {

    protected InterestServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public double calculateSimpleInterest(double principal, double rate, int time) throws RemoteException {
        return (principal * rate * time) / 100;
    }
}

