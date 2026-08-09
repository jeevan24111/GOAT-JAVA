public class basicOfInterface{
     public static void main(String[] args) {
        /* interface are contract in java which give some methods in java 
           and implementing class has to give defination to those  methods 
         */

        /* 
            1.if any class want to it call as animal,it has to define all methods of animal interface 
            then only it can become a animal

            2.all the methods given by animal class are abstarct by defualt and they are also 
                public
                ->implementing class cannot narrow its access modifiers of interface
            3.Interface Objectc cannot be created coz they have no methods but
            ->they are helpful in polymorphism -it can call child method by pointing them due to inheritance
        */

          /*
                        animal a1=new animal() {
                            
                        };
                        The type new animal(){} must implement the inherited abstract method animal.eat()
          The type new animal(){} must implement the inherited abstract method animal.sound()
          */  

          animal a1=new Dog();
          a1.eat();
          a1.sound();
        

    }
}
interface animal{
    void eat();
    void  sound();
}
//these the methods defined by the animal interface 

class Dog implements animal{
    /*  

        Cannot reduce the visibility of the inherited method from animal        
    u can make its access modifers as default ->coz interface access modifier is by defualt public
     void eat(){
        System.out.println("i am dog i am eating biscuits");
    }
    */

   public  void eat(){
         System.out.println("i am dog i am eating biscuits");
    }

    public void sound(){
         System.out.println("i am dog i make bark sound");
    }

    //now the dog has given all the methods of animal interface and now dog is animal
    //the contract given by animal is done
}


