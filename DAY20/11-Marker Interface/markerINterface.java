// package DAY20.11-Marker Interface;

public class markerINterface {
    public static void main(String[] args) {
        /*  marker interface just help in if i want that feature or not 
        explicitly i have to mention whether i need them 
          these unlocks power to my class
          these interface are empty 
          they are just used to if i want that features or not

          like clicking on it ,i need or not

          now these are replace by "ANNOTATION IN JAVa"
        object class->clone();

        B implements clonebale allow B class to get clonning feature
        i have to say,yes i want 

        */
    }
}

interface  A{
    default void fun(){
        System.out.println("hello");
    }
}

class B implements Cloneable{
    public void fun(){
        System.out.println("hello");
    }
}
