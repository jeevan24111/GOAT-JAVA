public class InterfaceClass {
    public static void main(String[] args) {
        /* interface means pure abstraction give undefined method 
         and if anyone to inherit to it,they have all the methods in them 
        */
        bike b1=new splendor();
        b1.gear();
        b1.accelerator();
        b1.breakk();
        bike b2=new platinum();
        b2.gear();
        b2.accelerator();
        b2.breakk();
        // bike b3=new bike(); Cannot instantiate the type bike
        // b3.accelerator();   ->you can't do this coz it is a interface and it is possible to create objects to it.it is 100% contract not object
        // b3.breakk();
        // b3.gear();
        
    }
}

interface bike{
    abstract  void gear();
    abstract  void accelerator();
    abstract   void breakk();
}

class splendor implements bike{

    //this class needs to implement all methods
   public  void gear(){  //  if you don't give public it will give visibilty error to bike
        System.out.println(" i have 4 gear and approach back to increase gear");
    }
   public   void accelerator(){
         System.out.println(" i am accelerating at 120 speed");
    }
    public void breakk(){
             System.out.println(" i am at high speed wait");
    }
}
class platinum implements bike{

    //this class needs to implement all methods
   public  void gear(){  //  if you don't give public it will give visibilty error to bike
        System.out.println(" i have 4 gear and approach back to increase gear");
    }
   public   void accelerator(){
         System.out.println(" i am accelerating at 150 speed");
    }
    public void breakk(){
             System.out.println(" i am at high speed wait");
    }
}
