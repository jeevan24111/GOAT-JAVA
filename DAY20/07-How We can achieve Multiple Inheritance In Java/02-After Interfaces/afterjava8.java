public class afterjava8 {
    public static void main(String[] args) {
        /*
            how multiple inheritance works in java 8 and 9 because we got default and static methods
        
            how interface will achieve multiple inheritance in java

            interface A has default methods
            interface B extends A and has default methods
            interface C extends A and has default methods
            class D implements B,C
            now d can give its implementation or it call call b or c methods while hen fun() is called

        */
       A a=new D();
       a.fun();

      
}
}

interface A{
    default void fun(){
        System.out.println("i am CLASS A");
    }
}
interface B extends A{
    @Override
   default void  fun(){
          System.out.println("i am CLASS B");
    }
}
interface C extends A{
    @Override
   default void  fun(){
          System.out.println("i am CLASS C");
    }
}

class D implements B,C{
    public void fun(){
        System.out.println(" i am CLASS D");
        //to call parent fun()
          B.super.fun();
          C.super.fun();
    }
     
      
 }


