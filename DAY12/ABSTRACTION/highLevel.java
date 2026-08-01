public class highLevel {
    public static void main(String[] args) {
        /*
          if i have class i have to objects each time to call their function and characteristics
          here also java give us abstraction feature

          where i create parent class objects and refer them to child class
          again a new abstraction is achieved
          and this can be possible in inheritance due to parent child relation
        */

          car c1=new ElectricCar();
          c1.start();         //   where i create parent class objects and refer them to child class
                                // again a new abstraction is achieved
          c1.accelerate();
          c1.grear();
          c1.handbreak();

          car d1=new DieselCar();
          d1.start();
          d1.accelerate();
          d1.grear();
          d1.handbreak();

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

class ElectricCar extends car{

    // ElectricCar(name,Color,Model,wheel);
    @Override    
    void grear(){
        System.out.println("i have no  gear, i am electric bro");
    }
}

class DieselCar extends car{

    //super(name,Color,Model,wheel);

}