// package DAY19.03-Understanding ENUMs;

public class howEnumsAre {
    public static void main(String[] args) {
        /*
           how enums are designed how they are created

           1.enums are classes but they have extends ENUMS class inside from it
           2.What are we see inside the  enum class are Objects of Enum class
           3.No one create objects outside for  enum class because its constructor is private 
           4.all objects inside are static final 
           

        */
    }
    
}

enum Direction{
    NORTH,
    SOUTH,
    EAST,
    WEST

  /*  internally 
    public static final Direction NORTH=new Direction(); 
   public static final Direction SOUTH=new Direction();
   public static final Direction EAST=new Direction();
   public static final Direction WEST=new Direction();


   private Direction(){
            constructor is private and this helps  no one can access it to create objects
   }
    */
};

