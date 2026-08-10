// package DAY21.05-INTERNAL OF STRINGS.05-Hash In Strings;

public class hashstring {
    public static void main(String[] args) {
        /* hashcode variable is used to store hascode value of a string 
        and whenever i need hashcode ot thats string it will be available in here i dont need to calculate it again 
        if it is present it will be hashcode ,if not it will calculate again
          
        once calculated it it will be stored in hashcode and it cannot be changed coz strings are immutable
        */
       String s1="hello";
       System.out.println(s1.hashCode()); //99162322

    }
}
