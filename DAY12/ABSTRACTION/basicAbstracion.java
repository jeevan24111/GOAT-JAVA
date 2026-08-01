public class basicAbstracion{
    public static void main(String[] args) {
        /*
             abstraction 
             ->means hiding the implementation of code adn showing what is necessary
             ->think of   a car ,you know how to drive car but you don't know the  internal implementation
                    you just start the  car ,put key,accelerator and gear but know how they all work
                    this is called abstraction
            ->java also provide this feature too
            ->hiding internal implementation and give what is necessary 

            ->target=>replace how to what
              ->focus on what is happening not how they are happening
        
        */

              car c1=new car("Ferrai","Red","2005",4);
              c1.start();
              c1.grear();
              c1.accelerate();
              c1.handbreak();  //i know what i am calling here but i don't know how they are calling 
              //java replaced how with what

              /* there are  2 level of abstraction java
                 1.low level abstraction
                 2.high level abstraction
                 
                 low level abstraction is achieved when we make seperate class and making objects in main fxn
                 here itself low level abstraction is achieved

                 high level of abstraction  is achieved by 
                 1.abstract class
                 2.interface class
              */
    }
}

class car{
    int wheel;
    String name;
    String Color;
    String Model;

    car(String name,String Color,String Model,int wheel){
        this.name=name;
        this.Color=Color;
        this.Model=Model;
        this.wheel=wheel;
    }
    car(){
        this("Unknown","Unknown","Unknown",0);
    }
    car(String name){
        this(name,"Unknown","Unknown",0);
    }
    car(String name,String Color){
        this(name,Color,"Unknown",0);
    }
    car(String name,String Color,String Model){
        this(name,Color,Model,0);
    }

    void start(){
        System.out.println("Starting the car "+this.name);
    }
    void grear(){
        System.out.println("putting gear");
    }
    void accelerate(){
        System.out.println("accelerting car "+this.name);
    }
    void handbreak(){
        System.out.println("putting hand break");
    }

}

