// package DAY21.04-Immutabality problems;

public class problem {
    public static void main(String[] args) {
        /*problem with string immutability is that each we we try to change the value, points to the new string and old value remains as it is
         */

        String s="";
        for(int i=0;i<5;i++){
            s+="e";
            System.out.println(s);
            // e
            // ee
            // eee
            // eeee
            // eeeee

            /*due to this lot of memory is wasted 
            to solve this java brought string builder and string buffer */
        }
    }
}
