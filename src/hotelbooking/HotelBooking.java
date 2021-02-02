package hotelbooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HotelBooking {

    private static final String url = "jdbc:mysql://localhost:3306/hotel_booking?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "Antiloop71";
    private static Statement sqlStatement = null; //Statement skapar ett object men det är  inte instansierat än.
    private static Connection connection = null; //Connection skapar ett object men det är  inte instansierat än.
    private static boolean continueLoop = true;
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        
        connection = DriverManager.getConnection(url, user, password); //Detta är ett annat sätt att skapa objekt.
        try {
            System.out.println("Anslutningen lyckades!");
            sqlStatement = connection.createStatement(); //Detta är ett annat sätt att skapa objekt.
            Menus.welcomeMessage();
            Menus.runHotelBooking();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            connection.close();
            System.out.println("Closing Connection to Server");
        }
        
    }
    
    
    public static void showRoom() throws SQLException{
    ResultSet result = sqlStatement.executeQuery("SELECT * FROM room;");
        // hämta antal kolumner
        int columnCount = result.getMetaData().getColumnCount();
        // hämta alla kolmnnamn
        String[] columnNames = new String[columnCount];
        for (int i = 0; i < columnCount; i++) {
            columnNames[i] = result.getMetaData().getColumnName(i + 1);
        }

        // lägg kolumnnamn i string array
        for (String columnName : columnNames) {
            System.out.print(PadRight(columnName));
        }

        while (result.next()) {
            System.out.println();
            // hämta data för alla kolumner för den nuvarande raden
            for (String columnName : columnNames) {
                String value = result.getString(columnName);

                if (value == null) {
                    value = "null";
                }

                System.out.print(PadRight(value));
            }
        }

        System.out.println();
        
    }
    
    
    public static void bookRoom() throws SQLException{
        int roomchoice=0;
        int customerId=0;
        int roomId=0;
        boolean continueLoop2 = true;
        
        System.out.println("Enter your Customer Number");
        while (continueLoop) {
            try {
                customerId = Integer.parseInt(sc.nextLine());
                if (customerId >= 1 && customerId <= 1000) {
                    continueLoop = false;
                } else {
                    System.out.println(" You can only choose 1-1000 ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input only numbers.");
            }
        }
        
        System.out.println("Choose a Room 'Enter the room number: '");
        while (continueLoop2) {
            try {
                roomchoice = Integer.parseInt(sc.nextLine());
                if (roomchoice >= 1 && roomchoice <= 8) {
                    continueLoop2 = false;
                } else {
                    System.out.println(" You can only choose 1-8 ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input only numbers.");
            }
        }
        
        System.out.println("You Choose room : " + roomchoice + "\n");
         ResultSet result = sqlStatement.executeQuery("SELECT room_id FROM room WHERE  room_number = " + roomchoice + ";");
         //ResultSet result = sqlStatement.executeQuery("SELECT * FROM " + tableName + ";");
         
      
         
         
         sqlStatement.executeUpdate("UPDATE room SET room_available = 'no' WHERE  room_number = " + roomchoice + ";");
        sqlStatement.executeUpdate("INSERT INTO booking (cust_id, room_id)"
        + "VAlUES (" + customerId + ", " + result + ");");
        
        
        System.out.println("Your booking is confirmed\n");
        System.out.println("We look forward to have you as a guest \n");
        
        
    
    }
    
    
     public static void createAnAccount() throws SQLException{
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
                if (phoneNo >= 000 && phoneNo <= 999) {
                    continueLoop = false;
                } else {
                    System.out.println("The phonenumber must have three digits.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input only numbers.");
            }
        }
        System.out.print("Testrad:" + name + " " + phoneNo + "\n");
        
        
        sqlStatement.executeUpdate("INSERT INTO customer (cust_name, phoneNo) VALUES('" + name + "', " + phoneNo + ");");
        System.out.print("Kunden är registrerad.\n");
        
        //Customer c1 = new Customer(name, phoneNo);
        //System.out.println(c1.toString());
        
//         Customer c1 = new Customer(name, phoneNo);
//       
//        try {
//           
//            FileOutputStream f = new FileOutputStream(new File("myCustomers.txt"));
//            ObjectOutputStream o = new ObjectOutputStream(f);
//           
//            o.writeObject(c1);
//           
//            o.close();
//            f.close();
//           
//            System.out.println("Du är nu registrerad som kund!");
//           
//        }
//           
//            catch (Exception e){
//                    System.out.println("File ot found");
//                    }
        
    }
     
      // Fyll ut varje sträng med whitespaces till max 30 tecken
    private static String PadRight(String string) {
        int totalStringLength = 18;
        int charsToPadd = totalStringLength - string.length();

        // incase the string is the same length or longer than our maximum lenght
        if (string.length() >= totalStringLength) {
            return string;
        }

        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < charsToPadd; i++) {
            stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }

    
    
}
