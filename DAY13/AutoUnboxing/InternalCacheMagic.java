package DAY13.AutoUnboxing;

public class InternalCacheMagic {
    public static void main(String[] args) {

        /*internla cache magic  of Integer.value() 
         
        */
        Integer x=100;
        Integer y=100;
            //(-127 to 128)
            //uses caching to store this range of values for performance and they are small in size and and they are used multiple times

        System.out.println(x==y); //true
       Integer  c=200;
        Integer d=200;
         System.out.println(x==y); //false
         //this range of values are usually not stored in cache and hence not used repeatedly


    }
}
