import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;


public class RMI_Client {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        //inits
        Registry registry = LocateRegistry.getRegistry(Constants.LOCALHOST, Constants.RMI_PORT);
        RMI_Remote remote = (RMI_Remote) registry.lookup(Constants.RMI_ID);
        Scanner scanner = new Scanner(System.in);

        echo_message_test(remote, scanner);
        adding_digits_test(remote, scanner); //adding digits

    }

    private static void adding_digits_test(RMI_Remote remote, Scanner scanner) throws RemoteException {
        System.out.println("Enter digit a: ");
        int a = scanner.nextInt();
        System.out.println("Enter digit b: ");
        int b = scanner.nextInt();

        //  non primitive type
        My_Digit my_digit_a = new My_Digit(a);
        My_Digit my_digit_b = new My_Digit(b);
        System.out.println(a + " + " + b + " = " + remote.addMyDigits(my_digit_a, my_digit_b));
    }

    private static void echo_message_test(RMI_Remote remote, Scanner scanner) throws RemoteException {
        //ask user for message input
        System.out.println("Enter your echo message: ");
        String client_message = scanner.nextLine();

        //non primitive type
        My_Message my_message = new My_Message(client_message);
        System.out.println("server echo response = " + remote.echoRMIMessage(my_message));
    }
}
