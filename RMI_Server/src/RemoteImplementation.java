import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class RemoteImplementation extends UnicastRemoteObject implements RMI_Remote {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected RemoteImplementation() throws RemoteException {
        super();
    }


    @Override
    public My_Digit addMyDigits(My_Digit a, My_Digit b) throws RemoteException {
        return a.add(b);
    }

    @Override
    public My_Message echoRMIMessage(My_Message message) throws RemoteException {
        return message;
    }

}
