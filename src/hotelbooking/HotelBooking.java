
package hotelbooking;


public class HotelBooking {

    
    public static void main(String[] args) {
        
        int userInputStartMenu;
        
        Menus.welcomeMessage();
        Menus.printStartMenu();
        userInputStartMenu = Menus.userInputStartMenu();
        Menus.switchStartMenu(userInputStartMenu);
        
    }
    
}
