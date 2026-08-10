// package DAY21.03-Golden RULE.02-COMPILE TIME;

public class compiletime {
    public static void main(String[] args) {
        /* what are compile time string 
            if we define string using leiteral method are compiled time coz they knwo they have to be created in string pool 
          String s1="ja"+"va";
          this is resolved it compile time only
        */

            String s="100";
            String s1="ja"+"va";

            System.out.println(s);
            System.out.println(s1);
            System.out.println(s==s1);
    }
}
