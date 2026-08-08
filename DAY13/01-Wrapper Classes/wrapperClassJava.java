public class wrapperClassJava{
    public static void main(String[] args) {
        /*
           what are wrapper classes in java

           wrapper classes help us to convert primitive data types into objects and
           objects into primitive 

           we have to AutoBoxing and autoUnBoxing in java to do this
           AutoBoxing ->converts primitive data type into objects 
           eg-> 
               int,                                         
              int,                                                 Integer,
            float,                                                 Float,
            double,                into                            Double,
            short,                                                  Short
          boolean                                                   Boolean
            long                                                    Long
            char                                                    Character

            ->primitive date types ke koi utility methods nahi hote sirf data store karte 
            wrapper helps to give this function


                primitive data type are stored in stack
                but when they are converted to objects they are stored in Heaps
                they behave as objects after conversion

        */


        int a=5;
        // a. does not give any functionalities coz it can only store data

        //if i do this
        String name="JAVA";
        //name . ->gives a lot of methods right
        //but we cannot achieve this in primitive data types
        //wrapper classes help us to give this

        Integer x=5;
       System.out.println(x.intValue()); // now it is giving multiple methods to us right

       //these are called wrapper classes in java

       Integer rollnumber=101;
       Float percentage=68.2f;
       Double expo=2312.23121324;
       Character grade='A';
       Boolean iamLearningJAVA=true;
       Short distance=52;
       Byte age=23;
       Long contact=78232128990l;

       System.out.println(rollnumber.doubleValue());
       System.out.println(percentage.toString());
       System.out.println(expo.floatValue());
       System.out.println(grade.valueOf(grade));
       System.out.println(iamLearningJAVA.booleanValue());
       System.out.println(distance.shortValue());
       System.out.println(age.hashCode());
       System.out.println(contact.toString());

    }

    
    
}
