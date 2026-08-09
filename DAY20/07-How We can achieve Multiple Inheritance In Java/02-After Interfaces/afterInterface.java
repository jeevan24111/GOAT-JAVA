// package DAY20.07-How We can achieve Multiple Inheritance In Java.01-Before interfaces;
class AfterInterface {
    public static void main(String[] args) {
        /*after interface a can implements both class and can override their methods too

         first is interface(){}
         A is also INnterface(){} extends first
         B is also INnterface(){} extends first
         C is  class which implements A,B 
         now we can achieve multiple inheritance through interfaces


        */
       C c=new C();
       c.fun();
       first  f1=new C();
       f1.fun();
    
    }
}

interface first{
    void fun();
}

interface A extends first{
    abstract void fun();
}
interface B extends first{
    abstract void fun();
}


class C implements  A,B{
    @Override
    public void fun(){
        System.out.println("i am B class");
    }
}


