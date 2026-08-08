public class BasicOfImmutableCLass{
    public static void main(String[] args){
        /*    what are immutable class in java
            immutable means you cannot change the values of  objects once they are created
            ->i will explain more on immutable class in threads

            lets see what is happening before making our immutable
        */

            /*i have created one class called Mutable which is having 2 instances name and age lets created objects of for this class
              */
             Mutable m1=new Mutable("I AM   ImMutable", 25);
             System.out.println(m1.age);   //printing age and name values before changing values
             System.out.println(m1.name);


             System.out.println(" After changing values:");
             /* now i will try to changes the values; */
             m1.age=30;
             m1.name=" i become mutable";
             System.out.println(m1.age);   //printing age and name values after changing values
             System.out.println(m1.name);
             
             /* from above i can change the values of object created
               i don't want that 
               my class should not allow objects to be get modified after once its values set
             */



    }
}

class Mutable{
    int age;
    String name;

    Mutable(String name,int age){
        this.name=name;
        this.age=age;
    }
}