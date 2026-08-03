// package DAY14.Anonymus Classes;

public class AnonymousJavaClass {
    public static void main(String[] args) {
        /* 
             anonymous class are used only once ->used to initialize abstract,interface or to extend them
             ->mostly for small things->but is replaced by  LAMBDAS
             it does not have any name 
             cannot create constructor
             its objects is created once and use immediately.u cannot create it again and again coz i do not have any name
             it is used while defining objects

             eg->u are in a meeting and during that u want one work like turning on the light .
             that time light turn on (Anonymous class) u call and u don't ask his name ,it just come and do its works
             and it goes and u cannot call him again coz u don't know his name 

                interview ques?
                1.can i define extra methods inside a anonymous class
                  ->yes but u cannot call them outside
                2.can  it have this keyword 
        */
            animal dog=new animal(){
                @Override
             public void   sound(){
                    System.out.println("bark bark");
                    start();
                }
                //extra method
                 void start(){
                    // The method start() from the type new animal(){} is never used locally
                    System.out.println("i am intialiazed by anonymous class i am starting in animal class");
                }
            };
            dog.sound();
            // dog.start(); The method start() is undefined for the type animal

            /*
             animal is a interface 
             new animal(){.....} gives temporary  implementation to sound
             that implementation don't have any name
             now dog object is pointing to that anonymous class
             */
            //now for abstract class
            vechile v1=new vechile(23){
                @Override

                    // int age =20;
                void start(){
                    System.out.println("i am intialiazed by anonymous class i am starting");
                    //can have access to this
                    System.out.println(this.name);

                    //accesing final variables
                    System.out.println(this.age);
                    System.out.println(age);
                }
                
            };

            //vehicle is object->it create its object
            v1.start();
    }
    
}
interface animal{
    void sound();
}

abstract class vechile{
    abstract void start();
    int name;
    vechile(int name){
        this.name=name;
    }
    final int age=18;
}
