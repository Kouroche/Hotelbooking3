package hotelbooking;

import java.util.Scanner;

public class Menus {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void welcomeMessage() {
        
        System.out.println("**************************************");
        System.out.println("Welcome to Hotel Booking System!");
        System.out.println("**************************************\n");

    }
        
    public static void printStartMenu() {
        
        System.out.println("Choose from the Start menu.");
        System.out.println("1. Customer");
        System.out.println("2. Receptionist");
        System.out.println("0. Exit");

    }

    public static int userInputStartMenu() {
        boolean continueLoop = true;
        int userInput = 0;
        
        while (continueLoop) {
            try {
                userInput = Integer.parseInt(sc.nextLine());
                if (userInput >= 0 && userInput <= 2) {
                    continueLoop = false;
                } else {
                    System.out.println("Choose a number from the menu.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input only numbers");
            }
        }
        return userInput;
    }
    
    public static void switchStartMenu(int userInputStartMenu) {
        
        switch (userInputStartMenu) {
            case 1:
                runCustomerMenu();
                break;
            case 2:
                runReceptionistMenu();
                break;
            case 0:
                System.out.println("\nThank You for using the Hotel Booking System!");
                System.out.println("You will now exit the program\n");
                System.exit(0); //BORDE DET VARA EN BOOLEAN HÄR?
        }
    }
    
    public static void runHotelBooking() {
        int userInputStartMenu;
        
        printStartMenu();
        userInputStartMenu = userInputStartMenu();
        switchStartMenu(userInputStartMenu);
        
    }
    
    public static void printCustomerMenu() {
        
        System.out.println("\nWelcome Dear customer!");
        System.out.println("What would you like to do?");
        System.out.println("1. Create an account");
        System.out.println("2. TEST-write to txt-file");
        System.out.println("3. TEST-read from txt-file");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. ");
        System.out.println("0. Return to Start menu");

    }
    
    public static int userInputCustomerMenu() {
        boolean continueLoop = true;
        int userInput = 0;
        
        while (continueLoop) {
            try {
                userInput = Integer.parseInt(sc.nextLine());
                if (userInput >= 0 && userInput <= 6) {
                    continueLoop = false;
                } else {
                    System.out.println("Choose a number from the menu.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input only numbers");
            }
        }
        return userInput;
    }
   
    private static void switchCustomerMenu(int userInputCustomerMenu) {

            switch (userInputCustomerMenu) {
                case 1:
                    CustMethods.createAnAccount();
                    break;
                case 2:
                    CustMethods.fileWriterWithUpdates();
                    //Method...
                    break;
                case 3:
                    CustMethods.fileReaderTest();
                    //Method...
                    break;
                case 4:
                    //Method...
                    break;
                case 5:
                    //Method...
                    break;
                case 6:
                    //Method...
                    break;
                case 0:
                    System.out.println("You will now return to the Start Menu\n");
                    runHotelBooking();
                    break;
            }
        
    }
    
    public static void runCustomerMenu() {
        int userInputCustomerMenu;
        boolean continueLoop = true;
        
        while (continueLoop) {
        printCustomerMenu();
        userInputCustomerMenu = userInputCustomerMenu();
        switchCustomerMenu(userInputCustomerMenu);
        }
        
    }

    public static void printReceptionistMenu() {
        
        System.out.println("\nWelcome Dear receptionist!");
        System.out.println("What would you like to do?");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. ");
        System.out.println("7. ");
        System.out.println("8. ");
        System.out.println("9. ");
        System.out.println("0. Return to Start menu");

    }
    
    public static int userInputReceptionistMenu() {
        boolean continueLoop = true;
        int userInput = 0;
        
        while (continueLoop) {
            try {
                userInput = Integer.parseInt(sc.nextLine());
                if (userInput >= 0 && userInput <= 9) {
                    continueLoop = false;
                } else {
                    System.out.println("Choose a number from the menu.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input only numbers");
            }
        }
        return userInput;
    }
    
    private static void switchReceptionistMenu(int userInputReceptionistMenu) {
        
            switch (userInputReceptionistMenu) {
                case 1:
                    //Method...
                    break;
                case 2:
                    //Method...
                    break;
                case 3:
                    //Method...
                    break;
                case 4:
                    //Method...
                    break;
                case 5:
                    //Method...
                    break;
                case 6:
                    //Method...
                    break;
                case 7:
                    //Method...
                    break;
                case 8:
                    //Method...
                    break;
                case 9:
                    //Method...
                    break;
                case 0:
                    System.out.println("You will now return to the Start Menu\n");
                    runHotelBooking();
                    break;
            }
    }
    
    public static void runReceptionistMenu() {
        int userInputReceptionistMenu;
        boolean continueLoop = true;

        while (continueLoop) {
        printReceptionistMenu();
        userInputReceptionistMenu = userInputReceptionistMenu();
        switchReceptionistMenu(userInputReceptionistMenu);
        }
    }
    
}
