// package DAY22.03-Mutability In Strings.02-interview ques;

public class interviw {
    public static void main(String[] args) {
        /* strings builder  does not override equals methods  */

        StringBuilder sb=new StringBuilder("helllo");
        StringBuilder bf=new StringBuilder("hello");
        System.out.println(sb.equals(bf)); //false 
    }
    
}
