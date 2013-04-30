import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    
    public static void main(String[] args) {
   	
        CalculatorInterface obj = null; 

        try { 

	    Registry registry = LocateRegistry.getRegistry("143.107.137.147");

	    // Lookup object reference associated to the name "CalculatorServer"
            obj = (CalculatorInterface)registry.lookup("CalculatorServer");
	    
            int message = 0;
	    switch (args[0]){
		case "add": message = obj.add(Integer.parseInt(args[1]),Integer.parseInt(args[2])); break;
		case "sub": message = obj.sub(Integer.parseInt(args[1]),Integer.parseInt(args[2])); break;
		case "times": message = obj.times(Integer.parseInt(args[1]),Integer.parseInt(args[2])); break;
		case "div": message = obj.div(Integer.parseInt(args[1]),Integer.parseInt(args[2]));  break;
	    }
		

            //int message = obj.add(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
            System.out.println(message); 
        } catch (Exception e) { 
            System.out.println("CalculatorClient exception: " + e.getMessage()); 
            e.printStackTrace(); 
        }        
    }
}
