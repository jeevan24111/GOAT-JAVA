// package DAY19.05-function in enums;

public class functionInEnum {
    
    public static void main(String[] args) {
        
        /* as enums are also class they can also have function
         if you want every object  should have function then you have to create them as abstract();
        */

         Direction2 d1=Direction2.NORTH;
         Direction2 d2=Direction2.SOUTH;
         Direction2 d3=Direction2.EAST;
         Direction2 d4=Direction2.WEST;

         d1.move();
         d2.move();
         d3.move();
         d4.move();

         /*
                i have  moved y+1
                i have  moved y-1
                i have  moved x+1
                i have  moved x-1
         */
    }
}

enum Direction2{
    // NORTH,  The enum constant NORTH must implement the abstract method move()
    // SOUTH, The enum constant SOUTH must implement the abstract method move()
    // EAST, The enum constant EAST must implement the abstract method move()
    // WEST;The enum constant WEST must implement the abstract method move()

    // abstract void move();
    // The enum Direction2 can only define the abstract method move() if it also defines enum constants with corresponding implementations

    /*
        as as noraml, we can have abstract method which child class need to define them
        here also each object has to to override move and give their own implementation since it does not define any objects object
        it has to give here only it done by anonymous class
    */

  NORTH{
    @Override
    public void move(){
        System.out.println(" i have  moved y+1");
    }
},

  SOUTH{
    @Override
    public void move(){
        System.out.println(" i have  moved y-1");
    }
}
  ,
  EAST{
    @Override
    public void move(){
        System.out.println(" i have  moved x+1");
    }
  },
  WEST{
    @Override
    public void move(){
        System.out.println(" i have  moved x-1");
    }
  };

        abstract void move();
   

};
