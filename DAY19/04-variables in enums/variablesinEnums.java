// package DAY19.04-variables in enums;

public class variablesinEnums {
    public static void main(String[] args) {
        /* as enums are also class they can also have  variables
          suppose i want reperesent direction in each object in enums
          i have to c
        */

          //accessing each direction values
          Direction1 d1=Direction1.NORTH;
          Direction1 d2=Direction1.SOUTH;
          Direction1 d3=Direction1.EAST;
          Direction1 d4=Direction1.WEST;
          // Direction1 d1=Direction1.NORTH;
          System.out.println(d1.degree);
          System.out.println(d2.degree);
          System.out.println(d3.degree);
          System.out.println(d4.degree);
    }
}

enum Direction1{
    // NORTH, The constructor Direction() is undefined
    // SOUTH,The constructor Direction() is undefined
    // EAST,The constructor Direction() is undefined
    // WEST;The constructor Direction() is undefined


    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270);

    
    public int degree;  //if i want this  field has to be in every object
    //i have pass it in constructor

    /*key point 
       how we assign values to a class objects throrugh constructor right,
       but here we cant declare objects outside enums and i have to declare them here only 
       so as normmal we will create constructor but values are passed to the constructor here only
    */

       Direction1(int degree){
        this.degree=degree;
       }

       /*
         internally

         Direction NORTH=new Drection(0)
         Direction SOUTH=new Drection(180)
         Direction EAST=new Drection(90)
         Direction WEST=new Drection(270)
       */
    
};
