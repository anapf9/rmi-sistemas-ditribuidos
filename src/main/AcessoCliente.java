package implementsRMI;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class AcessoCliente {
    public static void main(String args[]) throws RemoteException, NotBoundException{
        Registry registry = LocateRegistry.getRegistry(80);
        IAcesso acesso = (IAcesso) registry.lookup("Cadastro");
        System.out.println(email, nome, cidade, formacao, hab1, hab2, hab3, ex1, ex2, ex3);
    }

}