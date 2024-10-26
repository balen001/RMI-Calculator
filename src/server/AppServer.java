package server;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AppServer {
    public static void main(String[] args) throws RemoteException{
        try{
        Registry registry = LocateRegistry.createRegistry(1099);
        CalcServant rObj = new CalcServant();
        Naming.rebind("rmi://localhost/calc", rObj);
        System.out.println("The server is ready");
        }
        catch(Exception e){e.printStackTrace();}
    }
}
