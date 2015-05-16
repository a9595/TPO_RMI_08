import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class RMI_Server {

	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		RemoteImplementation impl = new RemoteImplementation();
		Registry registry = LocateRegistry.createRegistry(Constants.RMI_PORT);
		registry.bind(Constants.RMI_ID, impl);
		System.out.println("Server is started");
	}

}
