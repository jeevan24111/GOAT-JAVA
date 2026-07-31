// package DAY11.Inheritance;

public class InheritaneInJava {

    public static void main(String[] args) {
        /*inheritance means inheriting properties from  parents like characteristics an behaviour
         it helps in code reusability an polymorphism
        */


         human1 h1=new human1();
         h1.name="greater Man";
         h1.age=56;
         h1.gender="MALE";
         System.out.println(h1.name);
         System.out.println(h1.age);
         System.out.println(h1.gender);
         child1 c1 =new child1();
         c1.parent();
    }
    
}

 class human1{
    String name="boy";
    int age=20;
    String gender="male";

    // human1(String name,int age,String gender){
    //     this.name=name;
    //     this.age=age;
    //     this.gender=gender;
    // }

}

class child1 extends human1{
    
    void parent(){
        System.out.println("my parent name is "+super.name+" age is : "+super.age+"  he is : "+super.gender);
    }
}

