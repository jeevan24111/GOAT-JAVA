package DAY13.AutoUnboxing;

public class AutoUnBoxingClass {
    public static void main(String[] args) {
        /* auto unboxing in java is to covert objects into primitive
        Integer class->into0>int 

        it is also done implicitly by jvm
     */

        //unboxing->conversion from objects to primitive data type;

        Integer x=20;
        int sum=x; 

        //eg

        /*      internal conversion

                  int sum=x.intValue(); 

        */

        //objects
       Integer rollnumber=101;
       Float percentage=68.2f;
       Double expo=2312.23121324;
       Character grade='A';
       Boolean iamLearningJAVA=true;
       Short distance=52;
       Byte age=23;
       Long contact=78232128990l;

        System.out.println("Before Unboxing");
        System.out.println(" ");
        System.out.println(rollnumber.doubleValue());
       System.out.println(percentage.toString());
       System.out.println(expo.floatValue());
       System.out.println(grade.valueOf(grade));
       System.out.println(iamLearningJAVA.booleanValue());
       System.out.println(distance.shortValue());
       System.out.println(age.hashCode());
       System.out.println(contact.toString());
    

       //conversion to primitive data type

       int rl=rollnumber;
       float result=percentage;
       double math=percentage;
    //    float res1=(float) expo;        //Type mismatch: cannot convert from Double to float

        boolean learn=iamLearningJAVA;
        short dis=distance;
        byte grow=age;
        long phone=contact;


        System.out.println("After Unboxing");
         System.out.println(" ");
        
        System.out.println(rl);
        System.out.println(result);
        System.out.println(math);
        System.out.println(learn);
        System.out.println(dis);
        System.out.println(grow);
        System.out.println(phone);
        

        /* when we print AutoBoxed values they automatically autoUnBoxed */


        //pointer exception
        Integer x1=null;
        // int y=x1;  Null pointer access: This expression of type Integer is null but requires auto-unboxing
        /* keep in mind don't do autoboxing or autounboxing of this type 
        coz integer can't store null
        */
        
    
    }
    
}
