import java.util.HashMap;
import java.util.Map;

public class mapinJava {
    public static void main(String[] args) {
        /*map In java 
            Map is data structure used by java and it has 2 parts 
            one is key and another is value
            stored as key value pair
            eg:- name:"John"

            why we use map

            1.Map does not allow duplication of key but allows duplication of values
            2.Map also gives constant time search operations
        */

        //declaring an Map which can store key and value pair
            Map<Integer,String> m1=new HashMap<>();
            m1.put(101, "John");
            m1.put(102, "John");
            m1.put(103, "Rod");
            m1.put(104, "Alex");
            System.out.println(m1);

            m1.putAll(Map.of(103,"john",105,"bheem",106,"Ai"));
            System.out.println(m1);

            m1.remove(101);
            System.out.println(m1);

        Map<Integer,String>m2=new HashMap<>(m1);
        m2.put(201, "CSE");
        m2.put(202,"ECE");
        System.out.println(m2);

        //check for key in a pair
        System.out.println(m2.containsKey(205));
        System.out.println(m2.containsKey(202));
        System.out.println(m2.containsKey(210));
        
        // m2.containsKey(202);
        // m2.containsKey(210);


        //checks for value in a pair
        System.out.println(m2.containsValue("John"));
        System.out.println(m2.containsValue("ALex"));
        System.out.println(m2.containsValue("bheem"));

        Map<Integer,String>m3=new HashMap<>(m2);
        m3.remove(102);
        System.out.println(m3);
        m3.clear();

        System.out.println(m2.entrySet());
        m2.replace(101, "bheem"); //if exist it will replace else it will not 
        m2.replace(102, "g1");
        System.out.println(m2);

        m1.get(101);
        System.out.println(m1.get(103));
    }
    
}
