public class intro{
    public static void main(String[] args) {
        /*
            1.   intro to strings
               before we SEE WHAT ARE string in java 
               let see what are character in java
               char are the data type in java which stores 2 bytes of data in java
               like->'A-Z' ,'a-z' and more 
               
             2.  and strings are sequence of character which is 
                array of characters
               char[]=['A','B'] like that 

            3.but why we don't use char [] why?
               coz char[] dont give many functionlaties by themself
               so i have to write by my own for any functionalites i need
               but in  strings they have functionalities inside them only

               and STring are class ->they are store in heap and also having a class name Called String

            4.how we define String in java
               String name="Hello";

               internally (String name =new String("hello"));
               like how we do for Wrappper class
               Interger i=Ineteger.valueOF(4);

               likte this we define string in java

            5.String are immutable in java ?
                    yes ,string are immutable in java coz in java we use String many time 
                    and they are used in URL's,names,passwords and many where
                    these should be changed right.for That reason String are immutable and Widely used  in java
                    String class is final and methods and all are final so that no can change it.

         */

                    String s="hello";
                    String name="g1";
                    String age="twenty";

                    String inner=new String("he i am jeevan");

                    System.out.println(age);
                    System.out.println(name);
                    System.out.println(s);
                    System.out.println(inner);

                    //String gives us many functinalities to work on stored data
    }
}