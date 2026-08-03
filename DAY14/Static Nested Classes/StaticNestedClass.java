// package DAY14.Static Nested Classes;

public class StaticNestedClass {

     public static void main(String[] args) {

    /*      static nested classes are the classes which are inside of a class
    
          1. don't have implicit reference of outer class
         2. It can only access static members and directs access and direct access ,cannot access no static members
         3.new OuterClass.Static NestedClass();
         4.When inner class don't need outer class instance


           but i want to access outer class variable how do i do
            i have no reference ->u have to get its  outer class reference
            do it passing outer reference to inner class constructor and recieve it


                        IMPORTANT NOTE  
                     A static class behaves as normal class
                     it have can have constructor function and more
                     it can also extends or implement class
*/

            /*Object creation of static nested class*/

            //basic idea of static keyword
            //they are directly accessed by class not objects
            //   Outer.y;
            //to create objects for nested class in static class use same idea
             Outer out1=new Outer();

             //passing reference of outer class to inner class
            Outer.inner staticClass=new Outer.inner(out1);
            Outer.inner staticClass1=new Outer.inner(out1);

            //accessing static class  variables  and method
            System.out.println(  staticClass.aiminner);
            staticClass.print();

            Outer.inner sc3=new Outer.inner(out1);
            System.out.println(sc3.aiminner);
            sc3.print();

            //access modifiers
            // System.out.println(sc3.iamprivate); The field Outer.inner.iamprivate is not visible
            sc3.getIamPrivate();

            // System.out.println(Outer.inner.iampublic); Cannot make a static reference to the non-static field Outer.inner.iampublic

            System.out.println(sc3.iampublic);
            System.out.println(sc3.iamdefault);
            sc3.iamprotect();


            //same access modifiers logic is applied no changes 

            //can i make static variable and method inside static nested class

            //The static field Outer.inner.iamstaicvariable should be accessed in a static way
            System.out.println(sc3.iamstaicvariable);
            sc3.iamstaicmethod();

            Outer.inner.iamstaicmethod();
            System.out.println(Outer.inner.iamstaicvariable);

            //bank account eg
            BankAcnnUS us=new BankAcnnUS();
            System.out.println("Your total intrest is : "+us.ComputeIntrest(12000));
            
   }
    
}

class Outer{

     int x=10;
     void iamouter(){
        System.out.println("i am outer function u can call me");
     }
    static int y=10;

            static class inner{
                // A static class

            int aiminner=20;

             // from here i get the outer class reference 
            Outer outer;
            inner(Outer Out){
                this.outer=Out; 
            }

            void print(){
                System.out.println(y); 
                System.out.println("i am nested static class"); //access to outer class static variable
                // System.out.println(x);  Cannot make a static reference to the non-static field x

                /*
                   why a static cannot access non staic members 
                   coz static variables belong to class and they are called using class name
                   but non static are related to objects on creation 
                   when they have not created objects, no existance of any non static variables
                   when they are created they are related to objects not class
                */

                //but i want to access outer class variable how do i do
            //i have no reference ->u have to get its reference

            //i have called outer variables here
                    System.out.println(outer.x);
                    outer.iamouter();
            }

            //how do access modifier works

            private int iamprivate=12;

            public int getIamPrivate(){
                return iamprivate;
            }
            public int iampublic=12;
             int iamdefault=23;
             protected void iamprotect(){
                System.err.println(" ia m protected my value is protected");
             }

             //creation of static members

             static int iamstaicvariable=230;
             static void iamstaicmethod(){
                System.out.println("i am static method");
             }

             //yes u can make static members

             /*         IMPORTANT NOTE  
                     A static class behaves as normal class
                     it have can have constructor function and more
                     it can also extends or implement class
             */



    }
}

//eg on static nested class

class BankAcnnUS{

      private static class IntrestCalculator{
           static public double yearlyCalculate(double amount,int time){
                    return (double)(amount*time*0.9);
            }
    }

    public double ComputeIntrest(double amount){
         //to calculate intest i can make many function and call them but i dont want that
         //i create a helping class which have that many funtions and i can call them

         return BankAcnnUS.IntrestCalculator.yearlyCalculate(amount, 12);
    }
}
