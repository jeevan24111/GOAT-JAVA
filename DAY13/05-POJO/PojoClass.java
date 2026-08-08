public class PojoClass{
    public static void main(String[] args){
   /*   what are POJO class in JAVA
            POJO=Plain Old java objects

            Pojo class  is introduced by martin fowler in 2000 when enterprise java beans was complex

            pojo philosophy
            ->No heavy framework extend(like extending httpServlet)
            ->no annotation required(it is used but it is optional in pojo)
            ->Testable(it it no dependent on framework)
        Property                      POJO                              Java Bean
        No-arg constructor          Optional                           Mandatory
        Serializable              Not required                         Must implement Serializable
        Naming conventions       No strict rules                       Strict getter/setter naming (like getX())
        Fields                   Any access modifier                    Private fields only
   */ 
            pojo p1=new pojo();
            p1.setage(23);
            p1.setname("i am pojo class");
            System.out.println(p1.GetAge());
            System.out.println(p1.GetName());
            System.out.println(p1.getClass());

        //i got here  overtype mode (insert key toggle it //soln->press insert key to solve it)
          }
}
// a simple pojo class
class pojo{
    private int age;
    private String name;
    

    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }

    public int GetAge(){
        return age;
    }

    public String GetName(){
        return name;
    }



}