// package DAY16.Types Of Copies.DeepCopy.Shallow Copy;

public class deepCopy {
    public static void main(String[] args) {
      /*lets see how to do deep copy in java
        each time you get references through you have allocate in new heap and copies the oringal values in that heep
        adn whenever you are returning also same you have to
        

        lets see in this below eg
      */
     College c3=new College("MIT", "USA");
     SchoolStudent2 s2=new SchoolStudent2(10, "Duniya ka Papa", 1, 90, c3);
     System.out.println(s2.GetAge());
     System.out.println(s2.GetId());
     System.out.println(s2.getName());
     System.out.println(s2.getCls());
     System.out.println(s2.getClg().name);
     System.out.println(s2.getClg().Location);

     // now try to change values
     s2.getClg().name="OXford";
     s2.getClg().Location="USA";
      System.out.println(s2.getClg().name);
     System.out.println(s2.getClg().Location);

     //new heaps values are changed not the original values are changed

    }
    
}

        // 1.Making ur class final->so that no can inherit and modify it
        //  2.Making instance private and final 
        //  3.removing all the setters in class
final class SchoolStudent2{

   final private int Cls;
  final private String Name;
 final private  int id;
 final private  int age=20;
 private final College clg;

  SchoolStudent2(int Cls,String name,int id,int age,College clg){
    this.Cls=Cls;
    this.Name=name;
    this.id=id;
    // this.age=age;

    this.clg=new College(clg.name, clg.name);  //incoming reference  values are allocated in heap and this class is pointing to that class
  }

   public College getClg(){
    return new College(this.clg.name,this.clg.Location);
    //what are my class is pointing to is also copied to new heap and that heap is returned
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

class College{
    String name;
    String Location;

    College(String name,String Loc){
        this.name=name;
        this.Location=Loc;
    }

}


