// package DAY22.02-String Methods.02-Character Access.03-Comparison.04-Searching;

public class characterinjava {
    public static void main(String[] args) {
        String s="hello i am hero";

        //1 Returns the char value at the specified index. An index ranges from 0 to length() - 1. The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing.
        System.out.println(s.charAt(2));

        // 2.toCharArray()->Converts this string to a new character array.
        char[] s2=s.toCharArray();
        System.out.println(s2);
    }
}
