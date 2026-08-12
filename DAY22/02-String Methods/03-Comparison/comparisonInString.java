// package DAY22.02-String Methods.02-Character Access.03-Comparison.04-Searching;

public class comparisonInString {
    public static void main(String[] args) {
        /*comparison in string */
        String s1=new String("hello");
        String s2=new String("helloe");

        System.out.println(s1==s2);  //false
        System.out.println(s1.equals(s2)); //true
    
        System.out.println(s1.compareTo(s2));//true

        //does->lexicographical comparion->dictionary

        /*
          0 if equal 
           -ve and +ve based on string 
        */
    }
}
