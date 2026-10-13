// package DAY23.03-AFTER GENERICS;

public class javagenerics {
    public static void main(String[] args) {
        /* java generics solve all the problem  */
        aluesIN<Integer> a1=new aluesIN<>(23);
        aluesIN<String> a2=new aluesIN<>("hello");
        aluesIN<Float> a3=new aluesIN<>(23.34f);
        System.out.println(a1.getvalue());
        System.out.println(a2.getvalue());
        System.out.println(a3.getvalue());

        aluesIN<Integer> a5=new aluesIN(20);
       fun(20);
       fun("hello");

        
/* 
        23
        hello
        23.34
        */

        System.out.println(a1.getvalue()+5);
        System.out.println(a2.getvalue()+5);
        System.out.println(a3.getvalue()+5);
    }

    public static  <T> void  fun( T age){
            System.out.println("your age is "+age);
    }
}


class aluesIN<T>{  //here t can be any type which is declared at run time
    private T value;
    aluesIN(T value){
        this.value=value;
    }

    public T getvalue(){
        return value;
    }
}
