package DAY13.Why One Public Class In JAVA;

public class WhyOnePublicClassInJava{
    public static void main(String[] args) {
        
        /* A java file ->can have only one public class and it should same as file name
           class name and file name should same and there  should be public

           ques?
           1.why there should be only public class per file
           2.WhY class name should be same as file name

        1.why only one public class
            ->JVM runs our code right->from where it start executing
            ->it start from main function 
            ->if there are  multiple public class are  in a file,then  JVM don't know in which  public class main function is present
            to avoid this only one public class in a file
            -> if only one public class->coz it is public it have access from anywhere  and it know which  class have main function
           
        2.Why file name should be same as class name?
            public class WhyOnePublicClassInJav{}   The public type WhyOnePublicClassInJav must be defined in its own file

         ans->
                ->coz jvm  can load the class easily
               JVM  if it  sees file as DEMO.java then it can easily do ->DEMO.main()-> to call the main function without creating objects (coz is is static) and faster loading of file


               in this file,file name is WhyOnePublicClassInJava
               when java sees WhyOnePublicClassInJava.java as file name 
               it creates WhyOnePublicClassInJava.main() to execute our code
               and our code only one public class it knows in which public class  main is present
        */
    }
    
}

// public class one{}  The public type one must be defined in its own file

// public class two{}  he public type one must be defined in its own file
