// package DAY26.02-Working of Set and Map;

public class SetAndMapWorking {
    public static void main(String[] args) {
        /*Internal Working OF Set
        add,get,store,collision and linked list

        when we store an element in set
        first number the size of array module is taken and remainder value is got
        int that remainder is taken as index and in that index value is stored in that array

        ele=4
        array size 10
        4%10 is 2 so 
        in that array at 2 index value 2 is stored 


        getting an element in Set in java 
        get(23)
        element and the size of the array module is taken and then remainder value is taken and goes to that index and get the element

        store in Set
        set do not allow duplication 
        is 23 is in 2 index and again u enter 23 and goes to 2 position and sees the same element and does not allow to store it again
        
        collision
        ->if 2 values are getting the same index suppose 2nd index 
        if one is occupied and other got the same index then collision happens
        to avoid that 
        linked list is created and in that index and in that linked list size and value mod is taken and at a index it stored over there


         */

    //*INTERNAL WOKRING OF MAP */
    /*
      put,get,and stored

      put
      map accepts key and value 
      when we put a value
      keys hash code is taken with array size and index is got
      int that index both the key and value are stored


      get
      when we try to get a key 
      its hashCode is taken and index is taken and in that index if that key matches then it is written else not given

      Storing 

      if 2 values got the same index then linkedList if formed and hashing is occurs and and at a index both pair are stored
    */

    

    
    }
    
}
