// package DAY25.01-List Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class listInterface {
    public static void main(String[] args) {
        /* we will discuss about how the list interface works in java
           initially we know that object->iterable->collection->list interface

           after java 21 ,sequence collection came before list interface

           as we all know that object class is parent class and after all the interfaces methods are needed to be implemented by implementing class
            now List interface has all the methods to be implemented from all the interfaces


            before going to list interface we have sequence collection methods
            those are
            a.addfirst();
            b.addLast();
            c.removeFirst();
            d.removelast();
            e.getFirst();
            f.getLast();
        
        */

            List<Integer> li=new ArrayList<>();
            li.addFirst(23);
            li.addLast(34);
            li.add(23);


        System.out.println(li);
        System.out.println(li.getFirst());
        System.out.println(li.getLast());

        li.removeFirst();
        li.removeLast();
          System.out.println(li);

        System.out.println(li.add(67));


        //List

        /*1.Duplicates are allowed
          2.random access by index
        */

        /*lets move to the list interface 
         it has some methods which are implemented by arrayList and linkedlist

         eg:-1.get(index)
         2.set(index,value)
         3.add(index,value
         4.addAll(index, collection<? extends E))
         5.remove(index)
         6.indexOf(object value)
         7.lastIndex(object value)
         8.listIterator()->can be traversed in any location
         9.listIterator(int index)->starts from a particular index
         10.Of(value )
         11.copyOf();

        */

        List<Integer> li2=new LinkedList<>();
        li2.add(12);
        li2.add(23);
        li2.add(34);
        li2.add(34);
        li2.add(56);
        li2.add(23);
        System.out.println(li2);

        // System.out.println(li.get(3));

        int a=li2.get(1);
        System.out.println(a);


        System.out.println(li2.get(2));
        li2.set(3,344);
        System.out.println(li2);

        li2.add(0, 123);
        System.out.println(li2);


        li2.addAll(2,List.of(34,2,3,4,5,6));
        System.out.println(li2);

        System.out.println(li2.indexOf(344));

        System.out.println(li2.lastIndexOf(2));

        //list.of(1,2,3,45)
        //these value are immutable also for copyOf() 

        List<Integer> F1=List.of(34,56,67,78);
        System.out.println(F1);
        // F1.add(23);not allowed ->coz of() method does not allow to modify
        System.out.println(F1);

        List<Integer> f2=List.copyOf(li2);
        System.out.println(f2);
        // f2.add(233);not allowed to modify after copyOf
        System.out.println(f2); 

        ListIterator<Integer> it=li2.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        ListIterator<Integer> it2=li2.listIterator(2);
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        ListIterator<Integer> it3=li2.listIterator(4);
      while(it3.hasPrevious()){
        System.out.println(it3.previous());
      }
    }

}
