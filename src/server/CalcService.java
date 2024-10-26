package server;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalcService extends Remote{

    
    public String sendMessage(String msg) throws RemoteException;
    public double eval(final String str) throws RemoteException;

    
}
