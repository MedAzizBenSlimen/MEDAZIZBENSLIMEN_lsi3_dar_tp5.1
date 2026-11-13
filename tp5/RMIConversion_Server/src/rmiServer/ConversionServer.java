package rmiServer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmiService.ConversionImpl;

public class ConversionServer {

    public static void main(String[] args) {

        try {
            // Start the RMI Registry on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Create the remote object
            ConversionImpl service = new ConversionImpl();

            // Register the remote object
            registry.rebind("ConversionService", service);

            System.out.println("Serveur RMI demarre...");
            System.out.println("Service de conversion pret.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
