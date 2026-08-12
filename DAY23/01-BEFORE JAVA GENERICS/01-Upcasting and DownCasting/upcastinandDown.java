// package DAY23.01-BEFORE JAVA GENERICS.01-Upcasting and DownCasting;

public class upcastinandDown {
    public static void main(String[] args) {
        /* what are type safety in java
           1.String->"name"
           2.int->10
           3.double->34.3f

           as above for particular data type i can enter the specified data type value
           if i enter ->string->10 give error 
           this is knownn as type saftey in java

           lets see what is upcastinfg and downcasting in java
        */

           // upcasting->converting specified type into generalized types

           //as we know what parent can point to  child class and can call child class methods which are in parent only it cannot call child class method
            animal a=new dog();
            a.eat();
            // a.sound();

            //upcasting

            dog d=new dog();
            animal a1=d;
            // a1.sound();
            a1.eat();

            //here we converted dog class into animal class

            //specified class into generalized type 
            //this is known as upcasting

            //downcasting->converting generalized type into a specified type

            Object obj="hello";
            // String s=obj;  //  gives->incompatible types: Object cannot be converted to String(coz object knwos it has object but dont know whatr exactl obj is having ,so here we got this exception so we have convert it explicitly and we got this error at run time)

            String s=(String)obj;
            System.out.println(s);

            //run time error 
            Object obj1=10;
            String s2=(String)obj1; //Exception in thread "main" java.lang.ClassCastException:
              System.out.println(s2);
//here we got exception during run time rater than at compile time
/* as object is  having object but know it is having intger value when we are converting an integer value to string it gives errror at run time


   better to avoid  run time erroor and bringing it ot compile time error
*/

    }
}

class animal{
    void eat(){
        System.out.println("i am eating");
    }
}

class dog extends animal{
    void sound(){
        System.out.println("hsoud");
    }
}
