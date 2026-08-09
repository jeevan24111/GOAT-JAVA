// package DAY20.10-Functional Interface;

public class functionINterface {
    public static void main(String[] args) {
        /*function interface helps to unlock functional programming->now it is (lambdas expressions)
            function interface such as comparable interface and predicable interface
        */
    }
    
}
interface A{
    void fun();
}

class B implements A{
    @Override
    public void fun(){
        System.out.println(" i help to unlock funcitonal programming");
    }
}
