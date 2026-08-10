// package DAY21.02-Declaring Strings in Java.03-New MEethod;

public class newmethod {
    public static void main(String[] args) {
        /*from new method all the string are created in heap and not in string pool
         for each string created with new key word are in heap
        */

         String s1=new String("hello");
         String s2=new String("java");

         System.out.println(s1);
         System.out.println(s2);
         System.out.println(s1==s2);  //false
    }
}
