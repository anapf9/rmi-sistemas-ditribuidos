//package implementsRMI;

import java.rmi.*;

public class Acesso implements IAcesso {
    public String addEmail(String email) throws RemoteException {
        return (email);
    }

    public String addNome(String nome) throws RemoteException {
        return (nome);
    }

    public String addSobrenome(String sobrenome) throws RemoteException {
        return (sobrenome);
    }

    public String addCidade(String cidade) throws RemoteException {
        return (cidade);
    }

    public String addFormacao(String formacao) throws RemoteException {
        return (formacao);
    }

    public String addHabilidade(String hab) throws RemoteException {
        return (hab);
    }

    public String addExperiencia(String exp) throws RemoteException {
        return (exp);
    }
}