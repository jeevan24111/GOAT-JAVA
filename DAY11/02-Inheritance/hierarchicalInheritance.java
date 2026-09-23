package DAY11.Inheritance;

public class hierarchicalInheritance {
    public static void main(String[] args) {


        /* hierarchical inheritance 
                   A
                 /   \
                B     C
        */


                dad d1=new dad();
                child21 c1=new child21();
                child22 c2=new child22();

                System.out.println(d1.name);
                System.out.println(c1.name);
                     c1.parent1();
                System.out.println(c2.name);
                // c2.parent1();
        
    }
    
}

class dad{
    String name="DAD";

}

class child21 extends dad{

    void parent1(){
        System.out.println("My parent name is : "+name);
    }
}

class child22 extends dad{
     void parent1(){
        System.out.println("My parent name is : "+name);
    }

}
