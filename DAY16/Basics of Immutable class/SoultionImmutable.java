// package DAY16.Basics of Immutable class;

public class SoultionImmutable {
    public static void main(String[] args) {
        /* lets see some rules how we can make our class immutable
         1.Making ur class final->so that no can inherit and modify it
         2.Making instance private and final 
         3.removing all the setter in clas
        */
       SchoolStudent s1=new SchoolStudent(10,"ADRASH BACCHA", 12, 15);
       /* i made the class final ,removes setters and values are private and final and initialized once through constructor */
       System.out.println(s1.getCls());
       System.out.println(s1.getName());
       System.out.println(s1.GetAge());
       System.out.println(s1.GetId());
       System.out.println("----------------------");

       //lets try to change the values of instance variables

    //    s1.age=20;                    The field SchoolStudent.age is not visible
        // s1.Name="i am superman";         The field SchoolStudent.Name is not visible
        // SchoolStudent.age=200;           The field SchoolStudent.age is not visible

        /* now i am not able to change the values of instance variables
          i can assign values during object creation and only get those values through getters
          i am not able to set the values
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

  SchoolStudent(int Cls,String name,int id,int age){
    this.Cls=Cls;
    this.Name=name;
    this.id=id;
    // this.age=age;
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


}

