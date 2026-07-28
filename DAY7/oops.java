public class oops {
    public static void main(String[] args) {
        /* what is oops(object oriented programming)
            where we mimic the real world  to solve real world problem using OOPS(java)

            how do we mimic real world
            real world have 2 things
            1.characteristics   (in OOP's they are variables)
            2.behaviours (in OOP's they are method(Funtion))

                suppose i have to make student data which have name,age,gender and college 
                and student 2 comes he is also having same data ,so now i have to create multiple variables to store them
                but in OOPS we can define a blueprint for Student which is applicable for all Students
                -->also known as CLASS in JAVA

                i have to student 1 data ,to do that 
                i have to make object of Student1 using Class(blueprint)
            ->class is a blueprint to create objects
        */

        //creating objects for Students
        Student Student1=new Student();
        //Student 1 is created but no values assigned to it
         System.out.println(Student1.name); 
         System.out.println(Student1.age); 
         System.out.println(Student1.gender); 
         System.out.println(Student1.college);
          // gives null for string values 0 for integer

        Student1.name="JEEVAN BAHADDUR B k";
        Student1.age=21;                            //assigned values to student;
        Student1.gender="MALE";
        Student1.college="GECM";
        
         System.out.println(Student1.name); 
         System.out.println(Student1.age); 
         System.out.println(Student1.gender); 
         System.out.println(Student1.college); 
    }
    
}

/* blueprint for student data(class) */
class Student{
    String name;
    int age;
    String gender;
    String college;

}
