// package DAY20.04-Variables in Interfaces;

public class variableinInterface {
    public static void main(String[] args) {
        /* VARIABLES IN INTERFACES
           -as we all know we can give method name in interface and implementing class has to define those methods

           1.Now we can also give variables in interfaces
             ->the given variables are static and final 
             ->static because interface  don't have objects and final cox they cannot be changed

             ->it is mostly used in creating constants in an interfaces 
             ->we can also define constants in normal class but for each variable we have to give static and final explicitly ,but in interfaces it is set automatically
             -
             ->IN production we need alot of constants to declare ,there we can use this feature

             these constants can be only used in interface class only

             and if any class implemts  interface then these variables are also share among them

        */
       System.out.println(maths.PI_VALUE);
       System.out.println(maths.AGE);
       System.out.println(maths.GRAVITY);
    //    maths.AGE=20;  The final field maths.AGE cannot be assigned
    maths a=new algebra();
     System.out.println(a.PI_VALUE);
    System.out.println(a.GRAVITY);
    System.out.println(a.AGE);
    algebra a1=new algebra();
    a1.parentvalue();
   
    }
    
}

interface maths{
    double PI_VALUE=3.14;
    int AGE=100;
    Double GRAVITY=9.8;
}

class algebra implements maths{

    void parentvalue(){
        System.out.println("i am algebra ");
        System.out.println(PI_VALUE);
        System.out.println(AGE);
        System.out.println(GRAVITY);
    }
}
