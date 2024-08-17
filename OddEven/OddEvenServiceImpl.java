package OddEven;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class OddEvenServiceImpl extends UnicastRemoteObject implements OddEvenService {

    protected OddEvenServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public boolean isOdd(int number) throws RemoteException {
        return number % 2 != 0;
    }
}

