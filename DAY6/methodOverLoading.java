package DAY6;

public class methodOverLoading {
    public static void main(String[] args) {
         //same function but diff parameters
        int x=10,y=20,z=30;
         //lets create sum function with diff parameters
         sum(x);
         sum(x,y);
         sum(x,y,z);

         //for subtraction
          sub(x);
         sub(x,y);
         sub(x,y,z);
        
    }

    static void sum(int x){
        System.out.println(x);

    }
     static void sum(int x,int y){
         System.out.println(x+y);
    }
    static void sum(int x,int y,int z){
         System.out.println(x+y+z);
    }

     static void sub(int x){
        System.out.println(x);

    }
     static void sub(int x,int y){
         System.out.println(x-y);
    }
    static void sub(int x,int y,int z){
         System.out.println(x-y-z);
    }
}
