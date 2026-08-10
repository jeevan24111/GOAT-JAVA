// package DAY21.02-Declaring Strings in Java.01-Literlal method;

public class Literalmethod {
    public static void main(String[] args) {
        /*
            1.literal method 
                string created by this methods are stored in string pool of heap memory

                syntax:  String name="MongoDB";

           2.what string pool?
           string pool is area in heap memory where all the string are storred which are created by the method of literal
           and if any string has  a value which is already in string pool,then it will not create any new,it will point to old value 
           which saves a memory space 

        */
       String name="MongoDB";
       String db="MongoDB";

       String sql="mysql";

       System.out.println(name==db); //true
       System.out.println(sql==db);  //false
       /*
           here name,db,sql are created in string coz they are create from the method of literal .
           initially name will created first in String poool
           and when db is about create ,it has same value as name only 
           instead of creating a new value for it ,db will point to old value   
           and sql is also in string pool it do not have same value as name ,db hence ,it will create new value in string pool
        */

           
    }
    
}
