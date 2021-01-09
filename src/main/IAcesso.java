package implementsRMI;

import java.rmi.*;

public interface IAcesso extends Remote{
    public String email(String email) throws RemoteException;
    public String nome(String nome) throws RemoteException;
    public String sobrenome(String sobrenome) throws RemoteException;
    public String local(String cidade) throws RemoteException;
    public String formacao(String formacao) throws RemoteException;
    public String habilidades(String hab1, String hab2, String hab3) throws RemoteException;
    public String experiencia(String exp1, String exp2, String ex3) throws RemoteException;
}