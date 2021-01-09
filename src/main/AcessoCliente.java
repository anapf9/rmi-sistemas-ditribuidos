//package implementsRMI;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class AcessoCliente {
    public static void main(String args[]) throws RemoteException, NotBoundException{
        Registry registry = LocateRegistry.getRegistry(80);
        IAcesso acesso = (IAcesso) registry.lookup("cadastro");
        /*System.out.println(addEmail);
        System.out.println(addNome);
        System.out.println(addSobrenome);
        System.out.println(addCidade);
        System.out.println(addFormacao);
        System.out.println(addHab);
        System.out.println(addExp);*/
    }

}