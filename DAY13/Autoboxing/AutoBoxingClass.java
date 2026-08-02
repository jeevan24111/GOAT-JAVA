package DAY13.Autoboxing;

public class AutoBoxingClass {
    /*  what is AutoBoxing in JAva
       conversion of primitive data type into objects is called AutoBoxing
       it is automatically done by JVM
    */

     int x=223;
     Integer AutoBoxing=x;   //AutoBoxing ->Automatically converted to primitive to  objects


     // old of doing autoBoxing
     //Integer old =new Integer(x);        he constructor Integer(int) is deprecated since version 9
    
        //new method of AutoBoxing 
        Integer newMethod=Integer.valueOf(x);  //compiler call this method 
        /* happens inside of java internally
        

        class Integer{
         
             private int value;

             public static void valueOf(int value){
                    this.value=value;
            }

            
        }

        you don't need to write these if u want u can use new method of autoBoxing

         use first method it will automatically covert to objects
        */


         //Auto Boxing
     Integer age=123;
     Integer number=34;
     Integer value=23;
     

     //how it converts internally to objects
    //  Integer age=Integer.valueOf(23);
    //  Integer number=Integer.valueOf(23);
    //  Integer value=Integer.valueOf(23);


        
    
}
