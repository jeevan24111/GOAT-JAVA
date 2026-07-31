package DAY11.Encapsulation.privateModifers;

public class PrivateModifier{
    public static void main(String[] args) {

            student s1=new student();
        
        // System.out.println(s1.name);The field student. name is not visible
        // System.out.println(s1.name); The field student. name is not visible
        //System.out.println(s1.name); The field student. name is not visible
              
         //before setting values for student s1
        System.out.println(s1.getage());
        System.out.println(s1.getcollege());
        System.out.println(s1.getname());
         s1.setage(20);
         s1.setname("Alex");
         s1.setcollege("MIT");
          //AFter setting values for student s1
        System.out.println(s1.getage());
        System.out.println(s1.getcollege());
        System.out.println(s1.getname());
       
    }
    /*  note->use private variables when you don't need to give direct access but want to give access and use 
        getters and setters
    */
    
}

class student{
    private String name;
    private String college;
    private int age ;


    //setter->using to set name
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }

    public void setcollege(String college){
        this.college=college;
    }
        //getters->getting name
    public String getname(){
        return name;
    }
    public String getcollege(){
        return college;
    }
    public int getage(){
        return age;
    }
}