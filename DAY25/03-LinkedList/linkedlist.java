// package DAY25.03-LinkedList;

import java.util.LinkedList;
import java.util.List;

public class linkedlist {
    public static void main(String[] args) {
        /*linkedlIst is a class which implements List INterface and it has data part and pointer to the next node 
        
        it is known as singly list and 
        dll is having next and previous pointer ot move in both direction
          if a index is given then it will calculate from first and last ,from where it is close from there it will move to get the required elements

          formula->(index<size/2)

          it methods are same like  arraylist but internal working is different
        add(),remove(),set()

        */

        List<Integer> ll1=new LinkedList<>();
        ll1.addAll(List.of(22,2,3,23,23,23,23,2,32,3,23,23232,12,1,21));
        System.out.println(ll1);

        ll1.get(23);

        ll1.remove(23);
        System.out.println(ll1);

    }
}
