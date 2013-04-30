import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorInterfaceImpl extends UnicastRemoteObject implements CalculatorInterface {

	public CalculatorInterfaceImpl() throws RemoteException {
		super();
	}
	
	public int add(int a, int b) throws RemoteException{
		System.out.println("Solicitação de soma:" + a + " + " + b + " = " + (a + b));
		return a+b;
	}

	public int sub(int a, int b) throws RemoteException{
		System.out.println("Solicitação de subtração:" + a + " - " + b + " = " + (a - b));
		return a-b;
	}

	public int times(int a, int b) throws RemoteException{
		System.out.println("Solicitação de multiplicação:" + a + " * " + b + " = " + (a * b));
		return a*b;
	}

	public int div(int a, int b) throws RemoteException{
		System.out.println("Solicitação de divisão:" + a + " / " + b + " = " + (a / b));
		return a/b;
	}
}
