public class StringBuilderandBuffer{
    public static void main(String[] args) {
        /* string buiklder and buffer solves the problem of immutability of String in java
          

        they are inherited from class abstractString
        and string builder is not  thread safe and string buffer is thread safe
        and they are in java.lang. package
        */

        StringBuilder sb=new StringBuilder();//16
        StringBuilder sb1=new StringBuilder(50);//initialy declarin array size 
        System.out.println(sb.capacity());

        sb.append("hello");
        //   System.out.println(sb.capacity());
        //  sb.insert(2, "0");
        //  System.out.println(sb);
        //  sb.delete(2, 4);
        //  System.out.println(sb);
        //  sb.charAt(5);
        sb.append("helo ai ma hello hello helllo");
        System.out.println(sb.capacity());
         System.out.println(sb.length());
//          System.out.println(sb);
// sb.replace(1,3, "hh");
//          System.out.println(sb);
// sb.reverse();
//          System.out.println(sb.reverse());
            
            
            sb.ensureCapacity(200);  //if you forget to give array size
              System.out.println(sb.capacity());

            sb.trimToSize();  //trims alll spaces which are empty
              System.out.println(sb.capacity());
            //string builder is superset  of string class 


            //we use string builder when we want mutability if not then string methdos are there


            /*if need to convert string builder into string normal
               then
            */

               StringBuilder s2=new StringBuilder("hello");
               String s4=s2.toString();
               System.out.println(s4);

            //    tranform/comparsion methods are not avaiable in string builder


            // stringer buffer and builder does not override equals methods
    }
}
/* 
class StringBuilder extends abstractString{
    byte [] values;
    int count;

    count is used calculate how many sapces are left in stringbuilder

    string builder create an array of bytes of 16 capacity
    count will count how many sspace are occupied 

    capacity gives full array capacity size 

    once array is filled 
    string buikder creates new array with initial size*2+2;
    16*2+2=34
    and old data is copied to new array
    like that keeps on going
}

*/