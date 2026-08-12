// package DAY22.02-String Methods.04-Searching;

public class searching {
    public static void main(String[] args) {
        String s1=new String("hello");
        String s2=new String("hello");

        System.out.println(s1.contains("ity"));
        System.out.println(s1.contains("s2"));
        System.out.println(s1.indexOf("e"));
        System.out.println(s1.indexOf("e", 0));
        System.out.println(s1.lastIndexOf("l"));
        System.out.println(s1.startsWith("e"));
        System.out.println(s1.endsWith("h"));
    }
}
