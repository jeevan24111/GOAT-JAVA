// package DAY11.Inheritance;

public class multileveInheritance {
    public static void main(String[] args) {
            /* multilevel inheritance 
            A->B->C
            */


        college1 c1=new college1();
        section s1=new section();
        dept1 d1=new section();
         
        d1.details1();  //dept have college details in it
        d1.details();
        
        c1.details();  //college have only its values coz it is the parent

        s1.details();   //section have both college and dept properties and behaviour
        s1.details1(); s1.details2();  
    }
    
}

class college1{
    String name="OXFORD";
    String location="USA";
    int sinceYear=1990;
     void details(){
        System.out.println(" our college name is : "+name+" location : "+location+"\n since year : "+sinceYear);
    }
}

class dept1 extends college1{
    String branch="CSE";
    
    void details1(){
        System.out.println(" our college name is : "+name+" location : "+location+"\n since year : "+sinceYear);
        System.out.println("our branch is :"+branch);
    }

}

class section extends dept1{
    int section=1;

  
     void details2(){
        System.out.println(" our college name is : "+super.name+" location : "+super.location+"\n since year : "+super.sinceYear);
        System.out.println("our branch is :"+super.branch);
        System.out.println("our section is :"+section);
    }
}

