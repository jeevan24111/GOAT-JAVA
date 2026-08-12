// package DAY22.02-String Methods.01-Length and Emptyness;

public class lentghandempty {
    public static void main(String[] args) {
        String s1=new String("hello i am g1");
        String s2="";
        String s3=new String();
        //1.length()->gives length of the array
        System.out.println(s1.length());

        //2.emptyness
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());

        // /3.isblank()
        System.out.println(s1.isBlank());
        System.out.println(s2.isBlank());
        System.out.println(s3.isBlank());
    }
    
    
}
