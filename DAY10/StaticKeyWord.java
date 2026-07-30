public class StaticKeyWord{
    public static void main(String[] args){
        /*  
            what is static keyword 
                ->static keyword is used when we have lot of objects having same value
                eg->students have same college
                if we create objects of multiple student we are allocating size of college multiple times
                instead of that we can make it single and all the objects are pointing to it 
                
            it is possible by static keyword which make the instance value belong to class not to objects
        */

            Student s1=new Student("RAM",21,"MALE");
            System.out.println(s1.name);
            System.out.println(s1.age);
            System.out.println(s1.gender);

             //The static field Student. College should be accessed in a static way
            System.out.println(s1.College);


            //accessing as static value
            System.out.println("College name is "+Student.College);
            System.out.println("College Location is "+Student.location);
            //accessing static method
            Student.holiday();
            s1.holiday();

            //in short static means same for all object ,no need to create everytime
    }
}
class Student{
    String name;
    int age;
    String gender;
    static String College="MIT";
    static String location="USA";
    Student(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
        
        //The static field Student. College should be accessed in a static way

        //her college is static ,so it has to be accessed in static way

    }
    //we can create static methods in java

    static void holiday(){
        System.out.println("today is holiday\n");
    }
}