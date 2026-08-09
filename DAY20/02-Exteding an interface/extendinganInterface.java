// package DAY20.02-Exteding an interface;

public class extendinganInterface {
    public static void main(String[] args) {
        /* what if an implementing class don't want to give defintion for implementing class
            ->it just has to implements  the interface and make method as abstract and class as abstract
            and implemneting class of  abstract has to extends the abstract class and has to give defination
        */
       Vehicle v1=new Thar();
       v1.start();
       v1.breakk();
    }
}

interface Vehicle{
    void start();
    void breakk();
}


    //here car don't want to give defination for interface class 
    //hence it has to make class and methods as abstract 

abstract class Car implements Vehicle{

      public   abstract void start();
      public   abstract void breakk();
}

class Thar extends  Car{
   public  void start(){
            System.out.println("i am thar i have keys to start");
    }

    public void breakk(){
           System.out.println("i am thar i have  automatic breaking system");
    }
}
