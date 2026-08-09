// package DAY20.06-AFTER JAVA 8 & 9.01-Default and Static  Methods.02-private access modifier;

public class DefaultandStaticMethods {
    public static void main(String[] args) {
        /*after java 8 ,now my interfaces can also have 
             default and static methods

            but why->interface are contract they just give methods implementing class has tp define it
            but why java brought this default and static methods

            reason->suppose all java programs are using popstack()  interface ,now java releaesed this feature of new method in it
            now lot of 1000's  java programms  are using it and now they have give implemention code for newly released method
            to avoid that java gave default methods and later implementing class can overide it and give their method

            also static methods are introduce which directly accessed from interface 


            
        */
    //    physics p1=new physics();Cannot instantiate the type physics
    //    p1.velocity();
    //    p1.speed();

            physics p2=new Kinematics();
            p2.speed();
            p2.velocity(); //before child class implemention
            // i am default methods introduced in java 8
            p2.velocity();
            //  ok default are introduced in java


            //2.accessing static methods
           physics.maths();
            

    }
}

interface  physics{
    void speed();
      default  void velocity(){
            System.out.println(" i am default methods introduced in java 8");
    }
    static void maths(){
        System.out.println("physics is a language of maths");
    }
}

class Kinematics implements physics{
   public   void speed(){
          System.out.println(" i am kinematics i am speed");
     }

     @Override

    public   void velocity(){
       System.out.println(" ok default are introduced in java");
     }
}
