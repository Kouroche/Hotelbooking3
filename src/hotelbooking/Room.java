
package hotelbooking;


public abstract class Room {

   private String type;
   private int price;
   
  

    public Room(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" + "type=" + type + ", price=" + price + '}';
    }
   
  
   
   public abstract void price();
    

}


