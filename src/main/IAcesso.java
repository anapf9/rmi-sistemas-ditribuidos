//package implementsRMI;

import java.rmi.*;

public interface IAcesso extends Remote{
    public String addEmail(String email) throws RemoteException;
    public String addNome(String nome) throws RemoteException;
    public String addSobrenome(String sobrenome) throws RemoteException;
    public String addLocal(String cidade) throws RemoteException;
    public String addFormacao(String formacao) throws RemoteException;
    public String addHabilidade(String hab) throws RemoteException;
    public String addExperiencia(String exp) throws RemoteException;
}