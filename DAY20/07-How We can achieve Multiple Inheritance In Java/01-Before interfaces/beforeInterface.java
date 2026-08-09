// package DAY20.07-How We can achieve Multiple Inheritance In Java.01-Before interfaces;

public class beforeInterface {
    public static void main(String[] args) {
        /*before interfaces what was the problem to achieve multiple inheritance
          diamond problem is assigned 
               first has fun(){}
               now A extends fun(){}
               now B also extends fun(){}
               now if C cannot extends A,B because it don't know which class fun(){} it has call or inherit

               now it is confused 
               for that reason multiple inheritance it not possible through extends keyword
        */
       first f1=new first();
       A a=new A();
       B b=new B();
       f1.fun();
       a.fun();
       b.fun();
    }
}

class first{
    void fun(){
        System.out.println(" iam parent ");
    }
}

class A extends first{
    @Override
    public void fun(){
        System.out.println("i am a class");
    }
}
class B extends first{
    @Override
    public void fun(){
        System.out.println("i am B class");
    }
}

// here i cant inherit both A and B 
//i have to extend only one class
/* not possible do multiple inheritance  */

/* 
class C extends A,B{
    @Override
    public void fun(){
        System.out.println("i am B class");
    }
}

*/

