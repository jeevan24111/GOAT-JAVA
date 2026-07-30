public class staticRules {
    public static void main(String[] args) {
        

        /* static keyword rules
            1.static Method can access only static variables and method
                -they cannot access non static values coz non static variables belong to objects
                but static variables belong to class not objects
            2.Static variables cannot have this keyword
                    ->why->coz this refers to the current object variables but
                            static keyword belongs to class hence,no objects
                            -so no this keyword
            3.non static variables can access static variables
                ->non static variables are created using class and they can access class variables
            
            4.one static method can call one static method only
        */
          Student s1=new Student("RAM",21,"MALE");
            System.out.println(s1.name);
            System.out.println(s1.age);
            System.out.println(s1.gender);
            s1.holiday();
            s1.fun();

    }
    
}
class Student{
    String name;
    int age;
    String gender;
    static String College="MIT";
    static String location="USA";
    static int code=24;
    Student(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    //we can create static methods in java

    static void holiday(){
        System.out.println("today is holiday\n");
        // 1.static Method can access only static variables
        System.out.println(code);
        // System.out.println(age); Cannot make a static reference to the non-static field age

        //2.one static method can call one static method only
        fxn();
    }

    static void fxn(){
        System.out.println("Today is function at my home\n");
        // cannot make a static reference to the non-static field age
        // fun();->non static method
        
        //3.Static variables cannot have this keyword
        // System.out.println(this.name);  Cannot use this in a static context
    }

    public void fun(){
        //4.non static variables can access static variables
     System.out.println(" i am enjoying my day ");
     System.out.println(College);
     System.out.println(code);
}


    
}
 
