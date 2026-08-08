package DAY13.Autoboxing;

public class comparingWrapperClasses {
    public static void main(String[] args) {
        

        //comparing values of wrapper classes

        Integer value1=200;
        Integer value2=200;

        System.out.println(value1==value2);  //false->they are stored in heaps and this compares references
        System.out.println(value1.equals(value2));  //true because it compares two values stored in their references
    }
    
}
