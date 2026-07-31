// package DAY11.Encapsulation.default and protected;

public class defaultModifier {
    public static void main(String[] args) {
        /*default modifiers are accessible within a package
           if don't mention any access modifiers it is by default access modifiers
        */
            love l1=new love();
            l1.setNameAgeYears("Jeevan", "friend", 5);
            System.out.println(l1.getName());
            System.out.println(l1.getyear());
            System.out.println(l1.gettype());
    }
    
}
class love{
    private String type;
    private String name;
    private int years;

    void greet(){
        System.out.println("hello "+name);
        System.out.println("hello "+type);
    }
    
    public void setNameAgeYears(String name,String type,int years){
        this.name=name;
        this.type=type;
        this.years=years;
    }
    public String gettype(){
            return  type;
    }
    public String getName(){
            return  name;
    }
    
    public int getyear(){
            return  years;
    }



}
