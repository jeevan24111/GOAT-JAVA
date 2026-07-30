public class finalkeyword {
    public static void main(String[] args) {
        
        /*
           final keyword in java is used to make variables,method and class final (constant)

           if variable are assigned with final they cannot be changes
           if Methods are assigned with final they cannot be override
           if Class are assigned with final they cannot be Inherited
        */

           college c1=new college("MIT", "Engineering", 1600, "MIT1600", "USA");
           college c2=new college("OXFORD", "Medical", 1964, "OXF1964", "England");
           college c3=new college("HARVARD", "Business", 2000, "MIT2000", "UK");
            System.out.println("Before trying to change to final keyword");

           System.out.println(c1.name);
           System.out.println(c1.type);
           System.out.println(c1.sinceYear);
           System.out.println(c1.code);
           System.out.println(c1.location);
           System.out.println("---------------------");
           System.out.println(c2.name);
           System.out.println(c2.type);
           System.out.println(c2.sinceYear);
           System.out.println(c2.code);
           System.out.println(c2.location);
           System.out.println("---------------------");
           System.out.println(c3.name);
           System.out.println(c3.type);
           System.out.println(c3.sinceYear);
           System.out.println(c3.code);
           System.out.println(c3.location);
           System.out.println("---------------------");

        //    System.out.println("AFTer trying to change to final keyword");
        //    c1.name="OXFORD"; The final field college. name cannot be assigned
        //    c1.location="UK"; The final field college. location cannot be assigned
        //    c1.sinceYear=2026; The final field college. sinceYear cannot be assigned

        //accessing final static variables
        System.out.println(college.pi);
        System.out.println(c1.pi);
        System.out.println(c2.pi);
        System.out.println(c3.pi);
        c1.age=20;
        c1.iamFinal(c1.age);
        c1.iamFinal(c1.age,c1.num);

    }
    //final can be applied on class,parameter,methods and variables
    
}

class college{

    final String location;
    final  String name;
    final  String code;
    final int sinceYear;
    final String type;
    static final String world;
    int age=20;
    int num=10; //you can also variables as static and final which means which is common for all and cannot be changed
    static final float pi; // pi value is same for all and cannot be changed
    //all college details are final coz they do not change


    college(String name,String type,int sinceYear,String code,String location ){
        this.name=name;
        this.type=type;
        this.sinceYear=sinceYear;
        this.code=code;
        this.location=location;

    }

    static{
        world="earth";
        pi=3.14f;
    }

   //iamFinal method cannot be override by implementing class
    final void iamFinal(final int age ){ //parameter cannot be changed
        System.out.println(age);

    }
    final void iamFinal(final int age,int num ){ //parameter cannot be changed
        // age+=10;
        System.out.println(age);
        System.out.println(num);

    }

}

//dept class cannot be inherited
final class dept{
    int age1;
}


// The type section cannot subclass the final class dept
// class section extends dept{
    
// }
