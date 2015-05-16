import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMI_Remote extends Remote {

	public My_Digit addMyDigits(My_Digit a, My_Digit b) throws RemoteException;

    public My_Message echoRMIMessage(My_Message message) throws  RemoteException;

}
