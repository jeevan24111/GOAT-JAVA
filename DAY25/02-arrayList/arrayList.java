// package DAY25.02-arrayList;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        /*ArrayList and is class which implements List interface and it get some methods from all the above interface and it has have to implementation to it  
        
        90% of the times we use arrayList coz we have more reading operations than reading 
        */

        //ArrayList uses dynamic array which means,first it sized is fixed and once the size is filled after that it increases it size 
        
        // new array size=old capacity+(old capacity/2)

        /*it has methods like 
          get(index)
          add(,index,value)
          set(index,value)
          remove(value)
        */
       //arrayList has 3 type of constructors

       List<Integer>li1=new ArrayList<>(); //empty list
       List<Integer>li4=new ArrayList<>(); //empty list
       List<Integer>li2=new ArrayList<>(100);//list of array with 100 size 
       List<Integer>li3=new ArrayList<>(List.of(23,34,56,67,6,74,545)); //aarray with collection of elements


       System.out.println(li1);
       System.out.println(li2);
       System.out.println(li3);

       li1.addAll(List.of(23,34,44,5555,666));
       System.out.println(li1);


       //ensure capacity and trimtosize methods

       li2.addAll(List.of(12,12,12,12,1,21,21,21,21,21,2,12,12,12,1,21,21,21,2,12,1));

       li2.ensureCapacity(220);
       //gives size of array li2 of 220 size

       li3.trimTosize();
       //if the 100 size is occupied only 20 and rest 80 size is trimed
       
    

       
    }
}
