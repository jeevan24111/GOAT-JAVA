public class ConstructorJava{
    public static void main(String[] args){

        /*->constructor->constructor which have same name as class name
             ->   but don't have any return type 
             -> Constructor are called during the object creation
             ->it is called only once and it is to initialize objects
         */

            //creating object
            //parameterized constructor
            Student cs021=new Student("JEEVAN",21,"MALE","GECM");
            //default constructor calling 
            Student cs000=new Student();

               //parameterized constructor
            System.out.println(cs021.name);
            System.out.println(cs021.age);
            System.out.println(cs021.gender);
            System.out.println(cs021.College);
            cs021.attendence();

             //default constructor
            System.out.println(cs000.name);
            System.out.println(cs000.age);
            System.out.println(cs000.gender);
            System.out.println(cs000.College);
            cs000.attendence();

    }
}

class Student{
    int age;
    String name;
    String gender;
    String College;


    //This is a constructor (parameterized constructor)
    Student(String name,int age,String gender,String College){
        this.name=name;  //this keyword is used to point current object
        this.age=age;
        this.gender=gender;
        this.College=College;
    }
    //default constructor
       Student(){
        this.name="unknown";  //this keyword is used to point current object
        this.age=0;
        this.gender="unknown";
        this.College="unknown";
    }
    void attendence(){
        System.out.println(this.name+" is present");
    }
}