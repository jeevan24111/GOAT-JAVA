// package DAY12.POLYMORPHISM;

public class compiledTimePolymorphism {
    public static void main(String[] args) {
        //    2.Run time polymorphism(method overriding)


        //at run time it is deciding which one to call for that reason it is called as run time polymorphism
        mobile m1=new mobile();
        mobile iPhone17proMax=new IPhone();
        mobile pocoX3Pro=new Poco() ;
        mobile  samsungS26Ultra=new Samsung();
        mobile vivoX80Pro=new Vivo();

        iPhone17proMax.os();
         System.out.println("----------------------");
        pocoX3Pro.os();
         System.out.println("----------------------");
        // SamsungS26Ultra.os(): The target type of this expression must be a functional interface
        vivoX80Pro.os();
         System.out.println("----------------------");
        samsungS26Ultra.os();
         System.out.println("----------------------");
         m1.os();
          System.out.println("----------------------");
    }
    
}
class mobile{

    void os(){
        System.out.println("Every phone has a OS");
    }
}

class Vivo extends mobile{
    @Override
    void os(){
        System.out.println("My OS is Funtouch OS");
    }
}
class Poco extends mobile{
    @Override
    void os(){
         System.out.println("My OS is MiUi ");
    }
}

class IPhone extends mobile{
    @Override
    void os(){
         System.out.println("My OS is IOS");
    }
}class Samsung extends mobile{
    @Override
    void os(){
         System.out.println("My OS is OneUi");
    }
}