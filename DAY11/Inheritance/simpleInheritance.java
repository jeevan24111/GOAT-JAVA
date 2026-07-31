package DAY11.Inheritance;

public class simpleInheritance {
    public static void main(String[] args) {
        /* there are 4 types of inheritance in java
          1->simple inheritance =A->B
          2->multilevel inheritance=A->B->C
          3->Hierarchical inheritance
          4->multilevel inheritance
          
        */

          dept d1=new dept();
          d1.details();
    }
    
}

class college{
    String name="OXFORD";
    String location="USA";
    int sinceYear=1990;
}

class dept extends college{
    String branch="CSE";

    void details(){
        System.out.println(" our college name is : "+name+" location : "+location+"\n since year : "+sinceYear);
        System.out.println("our branch is :"+branch);
    }

}


