package implementsRMI;

import java.rmi.*;

public class Acesso implements ImpAcesso{
    public String email(String email) throws RemoteException{
        return (email);
    }
    public String nome(String nome) throws RemoteException{
        return (nome);
    }
    public String sobrenome(String sobrenome) throws RemoteException{
        return (sobrenome);
    }
    public String cidade(String cidade) throws RemoteException{
        return (cidade);
    }
    public String formacao(String formacao) throws RemoteException{
        return(formacao);
    }
    public String habilidades(String hab1, String hab2, String hab3) throws RemoteException{
        return(hab1, hab2, hab3);
    }
    public String experiencia(String exp1, String exp2, String exp3) throws RemoteException{
        return(exp1, exp2, exp3);
    }
}