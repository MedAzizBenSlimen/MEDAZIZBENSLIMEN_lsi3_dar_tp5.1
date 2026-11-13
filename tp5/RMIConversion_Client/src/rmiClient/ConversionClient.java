package rmiClient;

import java.rmi.Naming;

import rmiService.IConversion;

public class ConversionClient {

    public static void main(String[] args) {

        try {
            // Search for the remote object in the RMI Registry
            IConversion service = (IConversion)
                    Naming.lookup("rmi://localhost:1099/ConversionService");

            // Call the remote method
            double resultat = service.convertirMontant(500);

            // Display the result
            System.out.println("Conversion de 500 Euros en Dinars");
            System.out.println("----------------------------------");
            System.out.println("Montant en TND : " + resultat);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
