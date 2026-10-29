// package DAY26.01-Set and Map Deep Dive;

import java.util.*;

public class setmap {
    public static void main(String[] args) {

        //set is a data structure used in java

        /* Set is a used 
        1.Does not allow duplicate value
        2.Offer constant time search operation


        if i add duplicates set will not allow 
        and if i search any element it is done in constant time
        */
        
        Set<String> s1=new HashSet<>();
        Set<String> s3=new HashSet<>();

        s1.add("jee");
        s1.add("hii");
        s1.add("lion");
        s1.add("tiger");
        Set<String>s2=new HashSet<>(s1);
        s2.add("tiger"); //add value to s2
        s2.add("king");
        System.out.println(s2);

        System.out.println(s1);

        System.out.println(s1.addAll(List.of("hii","hii","lion","zoo")));  //add a list of elements to a set
        System.out.println(s1.contains("hii")); //checks whether it contains hii in s1 set

        System.out.println(s3.isEmpty());
        System.out.println(s1.isEmpty()); //check whether set is empty or  not

        System.out.println(s1.remove("hii")); //remove hii from s1 set
        System.out.println(s1);

        s1.addAll(s2);  //add whole set to s1 set
        System.out.println(s1);

        s1.clear(); //clear whole set
        System.out.println(s1);

        //iterating over a set 

        Iterator<String> it=s2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



      
        //set 
    }
    
}
