public class Strings{
    public static void main(String[] args){

            //string and arrays are non primitive
            /* string can also be stored as arrays */

        String name[]=new String[5];
        //it can store 5 names
        name[0]="abc1";
        name[1]="abc";
        name[2]="abc";
        name[3]="abc";
        name[3]="abc";

        //string name[] is stored in stack 
        //new string[5] is stored in heap
        //stack is will store reference of name[5] array
            //a reference will have 4 bytes

        //acessing elements is same as accessing elements in array

        for(int i=0;i<5;i++){
            System.out.println(name[i]);
        }


        //random access in java gives caching in java
        /* means if i access name[4] and name[6]
        next when i access those don't need to go to RAM it can easily accessed w/0 RAM */
    }
}