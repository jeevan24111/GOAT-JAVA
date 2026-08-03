// package DAY14.Nested Classes Idea;

public class BasicsOfNestedClasses {
    public static void main(String[] args) {
        /*
              What are Nested Classes?

        In Java, a nested class is a class defined within another class (the outer/enclosing class). This is a fundamental feature for organizing code, as it allows you to logically group classes that are only used in one place, increases encapsulation, and can lead to more readable and maintainable code.

        There are two main categories: static nested classes and non-static nested classes (also known as inner classes). Inner classes are further divided into three types: member, local, and anonymous


        static vs non static main diff->
               property                                                   
        1. outer class reference      
        2.Outer class access      
        3.How to create objects 
        4.when to use 
       
                        static         
         1. don't have implicit reference 
         2. It can only access static members and directs access and direct access
         3.new OuterClass.Static NestedClass();
         4.When inner class don't need outer class instance
         
              non static
        1.have implicit reference
        2.it have access to all members(including private instance variables)
        3.  3.outerInstance.new InnerClass();
        4.When inner class  is tightly coupled with  outer class instance

        */
    }
}

class Computer{
    //  nested classes

    static  class USB{
            //a static class 
    }
    class os{
            // a inner class
    }
}
