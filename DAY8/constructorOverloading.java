public class constructorOverloading {
    public static void main(String[] args) {
        
          /*
          at the end all constructor are calling the main constructor 

          eg->main chef tells all the assistant to chops vegetable and make ready other ingredients
          and at last main chef will make food

          like that all other constructor are calling main constructor
     */

          Student EC001=new Student("ABC",20,"MALE","MIT");
          Student EC002=new Student("IJK");
          Student EC003=new Student("LMN",20);
          Student EC004=new Student("PQR",20,"FEMALE");
          Student EC005=new Student("XYZ",20,"FEMALE","MIT");

          System.out.println(EC001.name);
          System.out.println(EC001.age);
          System.out.println(EC001.gender);
          System.out.println(EC001.College);
        System.out.println("---------------------");
         System.out.println(EC002.name);
          System.out.println(EC002.age);
          System.out.println(EC002.gender);
          System.out.println(EC002.College);
        System.out.println("---------------------");
            System.out.println(EC003.name);
            System.out.println(EC003.age);
            System.out.println(EC003.gender);
            System.out.println(EC003.College);
            System.out.println("---------------------");

             System.out.println(EC004.name);
            System.out.println(EC004.age);
            System.out.println(EC004.gender);
            System.out.println(EC004.College);
            System.out.println("---------------------");
             System.out.println(EC005.name);
            System.out.println(EC005.age);
            System.out.println(EC005.gender);
            System.out.println(EC005.College);
            System.out.println("---------------------");
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
        // this.name="unknown";  //this keyword is used to point current object
        // this.age=0;
        // this.gender="unknown";
        // this.College="unknown";
        this("unknown",0,"unknwon","unknown");
    }

     Student(String name){
        // this.name="unknown";  //this keyword is used to point current object
        // this.age=0;
        // this.gender="unknown";
        // this.College="unknown";
        this(name,0,"unknwon","unknown");
    }
    Student(String name,int age){
        this(name,age,"unknown","unknown");
    }
      Student(String name,int age,String gender){
        this(name,age,gender,"unknown");
     }


    void attendence(){
        System.out.println(this.name+" is present");
    }
}