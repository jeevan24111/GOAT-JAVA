// package DAY14.Inner Classes;

public class InnerClassJava {
    public static void main(String[] args) {
        /*
                A inner class is defined inside a class 
                it have reference to outer class coz it is dependent on outside class

                  
              non static
        1.have implicit reference
        2.it have access to all members(including private instance variables)
        3.  3.outerInstance.new InnerClass();
        4.When inner class  is tightly coupled with  outer class instance



        inner class don't have static member before java 16 but now it can have
        */

        // creation of objects to inner class
      //1.create outer class objects to access inside i need objects right normal
      //2.create object for inner class using outer class reference

      Outer1 out =new Outer1();
      Outer1.inner1 in=out.new inner1("I AM INNER CLASS");

      Outer1 out1=new Outer1();
      Outer1.inner1 in2=out1.new inner1("I AM INNER CLASS BRO");
    
    

      //accessing values 
      System.out.println(out.x);
      System.out.println(in.y);
      in2.aiminner();
      out.IamOuter();

      //accessing static members
      System.out.println(in2.age);
      System.out.println(Outer1.inner1.age);
      in2.whyiamstatic();
      Outer1.inner1.whyiamstatic();

      /*before java 16 static member not allowed in inner class
         becoz static belong to class and inner is created only on outer class object creation
         if it is created then each for each outer class object new new inner class objects is created and 
         static should be same for small for which objects it has to be same 
         it created a small confusion .For that reason it was not allowed before java 16
         but it is allowed to have static member now
      */

         //accessing access modifier value
        //    System.out.println(in2.x); The field Outer1.inner1.x is not visible
           System.out.println( in2.getX());

           //constructor value
           System.out.println(in2.name);
           System.out.println(in.name);
           System.out.println(in.getX());

       
    }
}

class Outer1{


    int x=10;

   private  static int  StaticVariable=12;
    static void StaticMethod(){
            System.out.println("i am outer class static method");
    }
    void IamOuter(){
        System.out.println("i am outer function");
    }
    class inner1{
        int y=20;
        String name;

        //constructor
        inner1(String name){
            this.name=name;
        }
        
        void aiminner(){
            System.out.println(x);
            System.out.println(y);
            System.out.println("i am inner function");
        }
        static void whyiamstatic(){
            System.out.println("i can have static member after java 16");
                //accessing outside class static members
            System.out.println(" i am outer class static variable " +StaticVariable);
            StaticMethod();
        }
        static int age=23;
         /* it has similar facilities like it can access static and non static variables
          and also have acsess modifiers
            behave as normal class 
            it has reference of  outer class 
        */
       private int x=200;

       public int getX(){
        return x;
       }

    }
}
