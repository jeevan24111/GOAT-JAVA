// package DAY18.JAVA OBJECT CLASS BASICS;

public class javaObjectClass {
    public static void main(String[] args) {
        /*
            what are java object class

            java objects class is a parent class of all the classes we define in java 
            by default all the class extends or have this class in them 
            ->inheritance can be see here and child class can override its parent class members

            1.Object is  a class name (parent of all classes)  
            2.it is present in java.lang (system)
            3.It is always imported no need to import it
            4.Every class in java inherits from Object Class 

            What is the reason why Objects class exits
            1.Common behaviours (inheritance)
            anything written in parent class is automatically inherited in child class and 
            Object class have some helpful methods which can be easily inherited to child and child can override them

            2.Polymorphism()->Parent class can refer to child class

        
        */
       Animal a=new Animal();
       a.print();

       Object a2=new Animal();
       System.out.println(  a2.hashCode());  //give hashCode value
       System.out.println(   a2.equals(a2)  ); // compare references
       a2.toString();   //gives hashCOde of animal a objects

       /*
          Objects class  has some methods which are inherited into child class
          and child class can give their own implementation of these object class

                I.CORE METHODS
                        1.toString();
                        2.equal();
                        3.getClass();
                        4.hashCode();
                
                II.Cloning
                        1.clone();
                
                III. Garbage collection()
                          1.finalize();

                IV.Threads
                        1.notify();
                        2.wait();
                        3.notifyAll();
                
       */
     
     
    }
}

class Animal{

    void print(){
        // calls parent class tpString method and gives default implementation of parent class of toString method 
        System.out.println(toString());
    }
}

class Car extends Object{


    
}
