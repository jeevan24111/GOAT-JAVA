public class staticblock {
    public static void main(String[] args) {
        /*   static blocks in java are used to initialize static variables in java 
            they are executed when the class is loaded
         static block are loaded first
        */

         System.out.println(Student123.College);
         System.out.println(Student123.location);
    }


}

class Student123{
    String name;
    int age;
    String gender;
    static String College;
    static String location;
    Student123(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    static{
        College="MIT";
        location="USA";
    }

    static void holiday(){
        System.out.println("today is holiday\n");
    }
}
