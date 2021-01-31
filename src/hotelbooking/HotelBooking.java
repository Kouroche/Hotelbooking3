package hotelbooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class HotelBooking {

    private static final String url = "jdbc:mysql://localhost:3306/hotel_booking?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "EGET PASSWORD";
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
        }
        
    }
    
}
