// package DAY20.08-JAVA RESOULTION PRIORITY RULE;

public class resolutionpriority {
    public static void main(String[] args) {
        /* suppose i have one interface with default method called fun()
         and class with same fun() method

         if c class implements A and extends class

         now if c tries to call fun() then which method will be called

         here java will call class's fun() method 
         due to java resolution priority rule
          */
         test t=new test();
         t.fun();
    }
}

interface amtheone{
    default void fun(){
        System.out.println("i am interface");
    }
}
class amtheclass{
    public void fun(){
        System.out.println("i am class");
    }
}

class test extends amtheclass implements amtheone{

}


