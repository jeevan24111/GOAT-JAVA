package DAY11.Inheritance;

public class multipleInheritance {
    public static void main(String[] args) {
        /* multiple inheritance is not possible in java
            due to diamond problem
         */
        diamond d1=new diamond();
        d1.show();
        gold g1=new gold();
        silver s1=new silver();
        g1.show();
        g1.show1();

        s1.show();
        s1.show2();
        // s1.show1(); not possible coz it is inherited
    }
}

class diamond{
    
    void show(){
        System.out.println("i am diamond");
    }
}

class gold extends diamond{

    void show1(){
        System.out.println("i am gold");
    }
}
class silver extends diamond{

    void show2(){
        System.out.println("i am silver");
    }
}

/*class copper extends gold ,silver{
        if it is possible then ,dont kknow which show to inherit
    }
*/
