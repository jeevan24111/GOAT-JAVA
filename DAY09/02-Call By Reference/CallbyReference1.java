public class CallbyReference1 {

 public static void main(String[] args) {
        /* call by reference is not supported by java but hence it does by call by values only to achieve
        call by reference in JAVA */

        int x=10, y=20;
        Random r1=new Random(x,y);
        System.out.println("Before Call by value x and y values are :"+r1.x+ " " +r1.y);
        sum(r1);
         System.out.println("AFter Call by value x and y values are :"+r1.x+ " " +r1.y);
    
    }
    static void sum(Random r){
        r.x+=10;
        r.y+=20;
    }

    
}

class Random{
    int x;
    int y;

    Random(int x,int y){
        this.x=x;
        this.y=y;
    }

    
}
