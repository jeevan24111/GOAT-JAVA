import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class howSetsConvertedToMap{
    public static void main(String[] args) {
        //* how sets are converted to MAP*/

        /*SET uses MAPS internally
          As maps have key and value 
          and in set only key is required and not value is not required in that case
          in set value is filled with a PRESENT which points a empty object in a HEAP

        */
    Set<Integer> s1=new HashSet<>();
    s1.add(23);
    Map<Integer,Object>m1=new HashMap<>();
    m1.putIfAbsent(101, "JOHN");
    // m1.put(101,PRESENT);

    //*!HOW SET/MAP->MAP */
    /*if key is given its its hashCode is taken 
    bucket number is taken 
    in that bucket the value is stored
    */


    
    }
}

class Node<k,v>{
    k key;
    v value;
    int hashCode;
    Node<k,v> next;  //it is present inside a  HASHMAP  and it is a static class
}