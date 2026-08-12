// package DAY22.02-String Methods.07-Advance;

public class advn {
    public static void main(String[] args) {
        // a string that has the same contents as this string, but is guaranteed to be from a pool of unique strings.
        String s1=new String("hello");
        String s6=s1.intern();
        System.out.println(s1==s6);


        //2.format()

    String age="20";
    String name="adi";
    System.out.println(String.format("hello your name is %s and Your age is %s",name,age));
    }
}

/*
String heap->hello<s1,s6
pool->hello-<s6

*/
