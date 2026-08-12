public class Problembeforegenerics{
    public static void main(String[] args){
            /* before java generics problem
            
            */

            aluesIN a=new aluesIN(23);
            aluesIN a1=new aluesIN("hello"); //The constructor aluesIN(String) is undefined 
            /* here i cannot pass string value into aluesIn class , int is defined  so i want to enter string here
            for that i have to create multiple class with diff data type

            if i want anytype it can take then i need to create multiple class with diff data type

            this is not good option ..

         
             */
    }
}

class aluesIN{
    private int value;
    aluesIN(int value){
        this.value=value;
    }

    public int getvalue(){
        return value;
    }
}
class aluesIN1{
    private String value;
    aluesIN1(String value){
        this.value=value;
    }

    public String getvalue(){
        return value;
    }
}
class aluesIN2{
    private float value;
    aluesIN2(float value){
        this.value=value;
    }

    public float getvalue(){
        return value;
    }
}