// package DAY20.06-AFTER JAVA 8 & 9.01-Default and Static  Methods.02-private access modifier;

public class PrivateMethodsInInterface {
    public static void main(String[] args) {
        
          /*after java 9 
             priavte methods are also introduced in java and these methods can only be used in interface only since
             interface can't create objects and they too dont have visibilty outside 

             it has to be used inside the interface
            2.variables of interface can be used in methods also
          */
         
            physics p1=new Kinematics();
            p1.velocity();
            System.out.println(physics.GRAVITY);
          physics.maths();
    }
}

interface  physics{
    double GRAVITY=9.82;
    void speed();
      default  void velocity(){
            System.out.println(" i am default methods introduced in java 8\n i have "+GRAVITY);
            iamprivate();
    }
    static void maths(){
        System.out.println("physics is a language of maths");
        //  iamprivate(); Cannot make a static reference to the non-static method iamprivate() from the type physics
    }
    private void iamprivate(){
        System.out.println(" i'm private method ,,introduced after java 9 and i have  to be used inside the interface ");
    }
}

class Kinematics implements physics{
   public   void speed(){
          System.out.println(" i am kinematics i am speed");
     }

    //  @Override

    // public   void velocity(){
    //    System.out.println(" ok default are introduced in java");
    //  }
}
