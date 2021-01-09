package package implementsRMI;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class AcessoServidor {
    public static void main(String args[]) throws RemoteException, NotBoundException{
        Acesso acesso = new Acesso();
        IAcesso stub = (IAcesso) UnicastRemoteObject.exportObject(acesso, 6677);
        Registry registry = LocateRegistry.createRegistry(30000);
        registry.rebind("Cadastro", stub);
    }

}