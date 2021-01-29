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
        System.out.println("1.\tCustomer");
        System.out.println("2.\tReceptionist");
        System.out.println("0.\tExit");

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
        int userInputCustomerMenu;
        int userInputReceptionistMenu;
        
        switch (userInputStartMenu) {
            case 1:
                printCustomerMenu();
                userInputCustomerMenu = userInputCustomerMenu();
                switchCustomerMenu(userInputCustomerMenu);
                break;
            case 2:
                printReceptionistMenu();
                userInputReceptionistMenu = userInputReceptionistMenu();
                switchReceptionistMenu(userInputReceptionistMenu);
                break;
            case 0:
                System.out.println("\nThank You for using the Hotel Booking System!");
                System.out.println("You will now exit the program\n");
                System.exit(0); //BORDE DET VARA EN BOOLEAN HÄR?
        }
    }
    
    public static void printCustomerMenu() {
        
        System.out.println("\nWelcome Dear customer!");
        System.out.println("What would you like to do?");
        System.out.println("1.\tCreate an account");
        System.out.println("2.\tTEST-write to txt-file");
        System.out.println("3.\tTEST-read from txt-file");
        System.out.println("4.\t");
        System.out.println("5.\t");
        System.out.println("6.\t");
        System.out.println("0.\tReturn to Start menu");

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
                Customer.createAnAccount();
                break;
            case 2:
                Customer.fileWriterWithUpdates();
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
            case 0:
                System.out.println("You will now return to the Start Menu\n");
                int userInputStartMenu;
                printStartMenu();
                userInputStartMenu = userInputStartMenu();
                switchStartMenu(userInputStartMenu);
                break;
        }
    }
    
    public static void printReceptionistMenu() {
        
        System.out.println("\nWelcome Dear receptionist!");
        System.out.println("What would you like to do?");
        System.out.println("1.\t");
        System.out.println("2.\t");
        System.out.println("3.\t");
        System.out.println("4.\t");
        System.out.println("5.\t");
        System.out.println("6.\t");
        System.out.println("7.\t");
        System.out.println("8.\t");
        System.out.println("9.\t");
        System.out.println("0.\tReturn to Start menu");

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
        
        switch (userInputReceptionistMenu()) {
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
                printStartMenu();
                int userInputStartMenu = userInputStartMenu();
                switchStartMenu(userInputStartMenu);
                break;
                
        }
    }
    
    
}
