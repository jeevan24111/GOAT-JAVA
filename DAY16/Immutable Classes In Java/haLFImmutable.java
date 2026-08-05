// package DAY16.Immutable Classes In Java;

public class haLFImmutable {
    public static void main(String[] args) {
        /*what if try to changes variables through references */

        //lets create  objects for college first
        College c1=new College("MIT", "USA");
        //let's create objects for schoolStudent and pass  reference college to it

        SchoolStudent s100=new SchoolStudent(9, "DADAJI", 100, 89, c1);
        System.out.println(s100);  //prints reference value
        System.out.println(s100.GetAge());
        System.out.println(s100.GetId());
        System.out.println(s100.getName());
        System.out.println(s100.getCls());
        // how to try to call clg
        System.out.println(s100.getClg().name);
        System.out.println(s100.getClg().Location);

        //s100.getClg gives clg reference and once we get reference by doing . we can get all values of that class 

        //can i change values through references->let's see
        s100.getClg().name="OXFORD";
        s100.getClg().Location="INDIA";
           System.out.println(s100.getClg().name);
        System.out.println(s100.getClg().Location);
        /* from above we can see that by references i can the values of other class
         but my aim is to make my class immutable ,it should not allow modifying values at any cost
         but adding references in my class is allowing modify values
         this is know as shallow copy which allow the reference to change the value of original objects value

         we need to stop this if we want class to immutable
        */
       

    }
    
}

        // 1.Making ur class final->so that no can inherit and modify it
        //  2.Making instance private and final 
        //  3.removing all the setters in class
final class SchoolStudent{

   final private int Cls;
  final private String Name;
 final private  int id;
 final static private  int age=20;
 private final College clg;

  SchoolStudent(int Cls,String name,int id,int age,College clg){
    this.Cls=Cls;
    this.Name=name;
    this.id=id;
    // this.age=age;

    this.clg=clg;
  }

  public int getCls(){
    return Cls;
  }

  public String getName(){
      int x=getCls();
      System.out.println(x);
    return Name;
  }

  public int GetAge(){
    return age;
  }
  public int GetId(){
    return id;
  }
  public College getClg(){
    return clg;
  }


}

class College{
    String name;
    String Location;

    College(String name,String Loc){
        this.name=name;
        this.Location=Loc;
    }

}
