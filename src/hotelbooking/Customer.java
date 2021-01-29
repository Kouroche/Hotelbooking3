package hotelbooking;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Customer {
    
    private static Scanner sc = new Scanner(System.in);
    
    private String name;
    private int phoneNo;

    public Customer(String name, int phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", phoneNo=" + phoneNo + '}';
    }
 
    public static void createAnAccount() {
        String name;
        int phoneNo = 0;
        boolean continueLoop = true;
        
        System.out.println("\nHow nice that you want to create an account!");
        System.out.println("Let's get started.");
        System.out.print("Please enter your full name:  ");
        name = sc.nextLine();
        System.out.print("Please enter your phone number:  ");
        
        while (continueLoop) {
            try {
                phoneNo = Integer.parseInt(sc.nextLine());
                if (phoneNo >= 000000 && phoneNo <= 999999) {
                    continueLoop = false;
                } else {
                    System.out.println("Choose a number from the menu.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input only numbers");
            }
        }
        
        Customer c1 = new Customer(name, phoneNo);
        System.out.println(c1.toString());
        
    }
    
    public static void fileWriterWithUpdates() {
        //FileWriter med uppdateringar! Inte längre skriva över.
        try {
            FileWriter c = new FileWriter("customers.txt", true);
            BufferedWriter cBuff = new BufferedWriter(c);
            cBuff.write("Welcome to Java Class!");
            cBuff.newLine();
            cBuff.close();  
            c.close(); 
            System.out.println("File BUFFERED file writer successfully written");
            System.out.println("");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public static void fileReaderTest() {
        
    }
    
}
