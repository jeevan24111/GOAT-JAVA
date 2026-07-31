package DAY11.Encapsulation.default and protected;

public class protectedmModifers {
    public static void main(String[] args) {
        /*protected can be accessed in within a package and inherited class */


        //this is parent class
         human h1=new human();
        h1.setname("alex");
        h1.surname="David";
        h1.setage(45);
        h1.Wealth=50000000;
        System.out.println(h1.getname());
        System.out.println(h1.getsurname());
        System.out.println(h1.getage());
        System.out.println(h1.Wealth);


        System.out.println("child class");
        //this is child class
        child1 c1=new child1();
        c1.setname("John");
        c1.setage(20);
        System.out.println(c1.getname());
        System.out.println(c1.getage());
        System.out.println(c1.getsurname());
        System.out.println(c1.getwealth());
    }
     
    
       
}


class human{
    protected String surname="David";
    private String FirstName;
    private int age;
    protected int Wealth;

    public void setname(String Firstname){
            this.FirstName=Firstname;
    }
    public void setage(int age){
        this.age=age;
    }

    public String getname(){
        return FirstName;
    }
    public int getage(){
        return age;
    }
      public String getsurname(){
        return surname;
    }
    protected void OurMantion(){
        System.out.println("our mantion is in hawaii");
    }

}

class child1 extends human{

    private String FirstName;
     private int age;

    public void setname(String firstname){
        this.FirstName=firstname;
    }
    public void setage(int age){
        this.age=age;
        
    }
     public String getname(){
        return FirstName;
        
    }
    public int getage(){
        return age;

    }

    public String getsurname(){
        return surname;
    }
    public int getwealth(){
        return Wealth;
    }
}
