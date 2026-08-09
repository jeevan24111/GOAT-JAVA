// package DAY20.03-Polymorphism in Interfaces;


public class polymorphismInJava {
    public static void main(String[] args) {
        /*  Interface Object cannot be created coz they have no methods but
            ->they are helpful in achieving  polymorphism -it can call child method by pointing them due to inheritance
      
                        flyaable a1=new flyaable() {
                            
                        };
                     Cannot instantiate the type flyaable
                     The type new flyaable(){} must implement the inherited abstract method flyaable.fly()
          */  
        flyaable a1=new bird();
        a1.fly();
       
    }
    
}
interface flyaable{
    void fly();
}

class bird implements flyaable{
    public void fly(){
        System.out.println(" i am bird ,flying through wings");
    }
}


