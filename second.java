import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class second{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        System.out.println("hello world");
        list.add(23);
        list.add(12);
        list.add(34);


        Iterator<Integer> c=list.iterator();

        while (c.hasNext()) {
            System.out.println(c.next());
            
        }
    }
}