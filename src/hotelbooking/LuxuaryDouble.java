
package hotelbooking;


public class LuxuaryDouble extends Room {

    public LuxuaryDouble(String type, int price) {
        super(type, price);
    }
    
    
     @Override
        public void price() {
            
            
            int price = getPrice() + 4000;
           
          
            System.out.println("Price for a Luxuary Double room is: " + price);
        
 
    }
        
   
    
    
}
