public class abstractClass {
    public static void main(String[] args) {
        /*Abstract class have defined an undefined methods
            defined methods and variables and constructor are carried to child and undefined methods has to be defined by child 

        */
        car1 c1=new ferrari("2005", "red", 2023, 300);
        c1.start();
        c1.breakk();
    }
    
}

abstract class car1{
    int year;
    String color;
    String Model;

    car1(String Model,String color,int year){
        this.Model=Model;
        this.color=color;
        this.year=year;
    }
    void start(){
        System.out.println("car is starting");
    }

    abstract void breakk();
}

class ferrari extends car1{

    int speed;
    ferrari(String Model,String color,int year,int speed){
        super(Model,color,year);
        this.speed=speed;
    }
    void start(){
        System.out.println("i am ferrari starting my car");
    }

    void breakk(){
        System.out.println("i put break by electric shock!! and i am speed "+this.speed+" i cant put break sorry" );
    }
}


