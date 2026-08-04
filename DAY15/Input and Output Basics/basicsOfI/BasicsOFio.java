// package DAY15.Input and Output Basics.basicsOfI;

public class BasicsOFio{
    public static void main(String[] args) {
        /*   Input an Output in java
        
             Standard I/O in JAVA

             types of I/O in java 
              1.Console I/O
              2.File  I/O
              3.Network  I/O
              4.Memory  I/O

            let's see how we get output in java

            System.out.println"Hello");->o/p =Hello

            here 1. println is a function which takes  as arguments
            and  2. out is as object of x class 
                3.System is a class name

                by doing System.out.println"Hello"); we get o/p
                 how it works
                 System is  a class,in that class we have x(for now it is unknown assume) class object which is static 
                 how we it is static ,we have it through . without creating  objects of System class
                 and in out object (class) we have println function ,which takes argument and gives ouput
                 

                 as of now structure is ->below
                 
                 class System{
                  
                  static X out;
                 }


                 class X{
                   
                     public  void  println(String input){
                         
                      } 
                 }


                 class System ->belong to java.lang package

        */
       System.out.println("hello");

    /*
        println function belong to PrintStream
        it have many printing method
        1.println();->prints and create a new line
        2.print();->gives o/p w/o a new line
        3.printf()->gives formatted o/p

        now we know that
        out is a object of printStream   class

        class System{
           
                static PrintStream out;
        }

        what is if this Printstream is not static
        then System has to create objects

        System s1=new System();
        s1.out.println("hello");

        like this we have to do to get o/p

    */

   /*           
       we have Input Stream for taking input and Output Stream for giving output
       
            InputStream ->read();
            OutputSTream ->write();
   */
       
    }
    
}
