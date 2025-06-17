package Aadhaar_Pan;

import java.util.Scanner;

public class Pan_Aadhaar_Match_App {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        AadhaarService aadhaarService = new AadhaarService();
        PanService panService = new PanService();

        //  Creating Pan Card Data For User's
        PanCard panCard1 = new PanCard("PAN1", "101", "UNION BANK", "STOCK");
        PanCard panCard2 = new PanCard("PAN2", "102", "HDFC BANK", "CRYPTO");
        PanCard panCard3 = new PanCard("PAN3", "103", "STATE BANK", "FD");

        // Set Pan Object Into Map
        panService.setPanMap("PAN1", panCard1);
        panService.setPanMap("PAN2", panCard2);
        panService.setPanMap("PAN3", panCard3);


        // Creating Aadhaar Card Data For User's
        AadhaarCard aadhaarCard1 = new AadhaarCard("101", "RAMESH", "MUKESH", "MUMBAI");
        AadhaarCard aadhaarCard2 = new AadhaarCard("102", "RAJESH", "RAHUL", "DELHI");
        AadhaarCard aadhaarCard3 = new AadhaarCard("103", "FAIZ", "HANIF", "AGRA");

        // Set Aadhaar Object Into Map
        aadhaarService.setAadhaarMap("101", aadhaarCard1);
        aadhaarService.setAadhaarMap("102", aadhaarCard2);
        aadhaarService.setAadhaarMap("103", aadhaarCard3);

        // Get Aadhaar Number From User To Find Details Of User
        System.out.println("Enter Aadhaar Card Number: ");
        String aadhaarNumber = scanner.nextLine();
        AadhaarCard aadhaarCard = aadhaarService.getAadhaar(aadhaarNumber);

        // For Pan Card Details
        PanCard panCard = panService.getPan(aadhaarNumber);

        // Display Both
        try {
            if (panCard != null && aadhaarCard != null) {
                System.out.println("Aadhaar Details: " + aadhaarCard);
                System.out.println("Pan Details: " + panCard);
            } else {
                throw new Exception("No Data Found..");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
